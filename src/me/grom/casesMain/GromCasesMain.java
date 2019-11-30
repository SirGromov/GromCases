package me.grom.casesMain;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class GromCasesMain extends JavaPlugin implements Listener{

    FileConfiguration cases = getConfig();

	static GromCasesMain instance;

	@Override
	public void onEnable() {
		saveConfig();
		this.getLogger().info("==================");
		this.getLogger().info("GromCases Enabled!");
		this.getLogger().info("==================");
        getServer().getPluginManager().registerEvents(this, (Plugin)this);
        this.getCommand("case").setExecutor(new CommandCases());
        this.getCommand("caseadmin").setExecutor(new CommandCases());

		instance = this;
		GromCasesMain.instance.saveConfig();
		
		Bukkit.getPluginManager().registerEvents(new ListenerGUICase(), this);
		Bukkit.getPluginManager().registerEvents(new ListenerGUIShop(), this);
	}
	
	public void onDisable() {
		this.getLogger().info("===================");
		this.getLogger().info("GromCases Disabled!");
		this.getLogger().info("===================");
		GromCasesMain.instance.saveConfig();
	}

	void setRegularCases(String PlayerName, int qua) {
	    cases.set("cases." + PlayerName + ".regular", qua);
	    GromCasesMain.instance.saveConfig();
    }
	
	public int getRegularCases(String PlayerName){
		int qua = cases.getInt("cases." + PlayerName + ".regular");
		GromCasesMain.instance.saveConfig();
		return qua;
    }
	
	public Location getAltarPos() {
		Location loc = new Location(Bukkit.getWorld(cases.getString("altar.world")), 
				cases.getDouble("altar.x"), 
				cases.getDouble("altar.y"), 
				cases.getDouble("altar.z"));
		GromCasesMain.instance.saveConfig();
		return loc;
	}
	
	void setAltarPos(Location loc) {
		cases.set("altar.world", loc.getWorld().getName());
		cases.set("altar.x", loc.getX());
		cases.set("altar.y", loc.getY());
		cases.set("altar.z", loc.getZ());
		GromCasesMain.instance.saveConfig();
	}
	
	void updateCases(String PlayerName) {
	    cases.set("cases." + PlayerName + ".test", 0);
	    cases.set("altar.test", 0);
	    GromCasesMain.instance.saveConfig();
    }
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		updateCases(p.getName());
        int pregcases = getRegularCases(p.getName());
        if (pregcases > 0) {
            p.sendMessage(ChatColor.DARK_PURPLE + "У вас есть неоткрытые кейсы!");
        }
	}
	
	@EventHandler
	public void onClick(PlayerInteractEvent e) {
		Block block = e.getClickedBlock();
		if (block.getLocation().equals(getAltarPos())) {
			Player p = e.getPlayer();
        	ListenerGUICase.openGui(p);
		}
		if (e.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.ARROW)) {
			if (e.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Выбрать блок")){
				setAltarPos(block.getLocation());
				Player p = e.getPlayer();
				p.sendMessage("Алтарь уставновлен!");
			}
		}
	}


}
