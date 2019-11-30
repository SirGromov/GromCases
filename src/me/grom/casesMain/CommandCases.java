package me.grom.casesMain;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.grom.casesUtils.ItemUtil;

public class CommandCases implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
        if (cmd.getName().equalsIgnoreCase("case")) {
        	if (!(sender instanceof Player)) {
                sender.sendMessage("This command can be run by a Player!");
                return true;
            } else {
            	Player p = (Player) sender;
            	if (args[0].equalsIgnoreCase("open")) {
	            	ListenerGUICase.openGui(p);
	            	return true;
            	} 
            }
        } 
        if (cmd.getName().equalsIgnoreCase("caseadmin")) {
        	if (args[0].equalsIgnoreCase("add")) {
        		if (args[1].equalsIgnoreCase("regular")) {
        			Integer regcase = (Integer) GromCasesMain.instance.getRegularCases(args[2]);
        			int newcase = regcase + Integer.parseInt(args[3]);
        			GromCasesMain.instance.setRegularCases(args[2], newcase);
        			return true;
        			}
        	} else if (args[0].equalsIgnoreCase("remove")) {
        		if (args[1].equalsIgnoreCase("regular")) {
        			Integer regcase = (Integer) GromCasesMain.instance.getRegularCases(args[2]);
        			int newcase = regcase - Integer.parseInt(args[3]);
        			GromCasesMain.instance.setRegularCases(args[2], newcase);
        			return true;
        			}
        	} else if (args[0].equalsIgnoreCase("set")) {
        		if (args[1].equalsIgnoreCase("regular")) {
        			GromCasesMain.instance.setRegularCases(args[2], Integer.parseInt(args[3]));
        			return true;
        			}
        	} else if (args[0].equalsIgnoreCase("altar") && sender instanceof Player) {
        		Player p = (Player) sender;
        		ItemStack i = ItemUtil.create(Material.ARROW, 1, ChatColor.GREEN + "Выбрать блок", null);
        		p.getInventory().addItem(i);
        		p.sendMessage("Следующий блок, по которому вы кликните будет алтарем открытия!");
        	} else if (args[0].equalsIgnoreCase("altarreload") && sender instanceof Player) {
        		Player p = (Player) sender;
        		Location loc = p.getLocation();
        		GromCasesMain.instance.setAltarPos(loc);
        		p.sendMessage("1");
        	} else {
        		sender.sendMessage("Illegal Argument");
        		return true;
        	}
        }
        return true;
        }
}
