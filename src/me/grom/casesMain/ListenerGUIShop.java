package me.grom.casesMain;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.grom.casesUtils.ItemUtil;

public class ListenerGUIShop implements Listener{
	
	public static void openGui(Player p) {
		Inventory inv = Bukkit.createInventory(null, 45, ChatColor.RED + "Базар");
		
		inv.setItem(0, ItemUtil.create(Material.CHEST, 1, ChatColor.GREEN + "Купить: Обычный кейс", Arrays.asList(ChatColor.GOLD + "Цена: 2 алмаза")));
		inv.setItem(44, ItemUtil.create(Material.ARROW, 1, ChatColor.GREEN + "К кейсам", null));
		p.openInventory(inv);
	}
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if (e.getInventory().getSize() == 45) {
			e.setCancelled(true);
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Купить: Обычный кейс")) {
				if (p.getInventory().contains(Material.DIAMOND, 2)) {
					int regcase = GromCasesMain.instance.getRegularCases(p.getName());
					GromCasesMain.instance.setRegularCases(p.getName(), regcase+1);
					p.getInventory().removeItem(new ItemStack(Material.DIAMOND, 2));
				} else {
					p.sendMessage("Деняк нема");
				}
			} else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "К кейсам")) {
				ListenerGUICase.openGui(p);
			}
		}
	}

}
