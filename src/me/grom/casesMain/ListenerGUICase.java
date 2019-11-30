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

public class ListenerGUICase implements Listener{
	
	public static void openGui(Player p) {
		Inventory inv = Bukkit.createInventory(null, 45, ChatColor.RED + "�����");
		int regcase = GromCasesMain.instance.getRegularCases(p.getName());
		Integer newcase = (Integer) regcase;
		inv.setItem(22, ItemUtil.create(Material.CHEST, regcase, ChatColor.GREEN + "������� ����", Arrays.asList(ChatColor.GOLD + "�������: " + newcase.toString())));
		
		inv.setItem(36, ItemUtil.create(Material.GOLD_NUGGET, 1, ChatColor.GREEN + "�������", null));
		inv.setItem(44, ItemUtil.create(Material.ARROW, 1, ChatColor.GREEN + "�����", null));
		
		p.openInventory(inv);
	}
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if (e.getInventory().getSize() == 45) {
			e.setCancelled(true);
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "������� ����")) {
				int regcase = GromCasesMain.instance.getRegularCases(p.getName());
    			if (regcase >= 1) {
        			ItemStack item = me.grom.casesDrop.RegularCaseDrop.ItemRandom(p);
        			p.getInventory().addItem(item);
        			GromCasesMain.instance.setRegularCases(p.getName(), regcase-1);
        			p.closeInventory();
        		}
    			else {
    				p.sendMessage(ChatColor.DARK_RED + "������ ����");
    				p.closeInventory();
    			}
			} else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "�����")) {
				p.closeInventory();
			} else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "�������")) {
				ListenerGUIShop.openGui(p);
			}
		}
	}

}
