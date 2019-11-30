package me.grom.casesDrop;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class RegularCaseDrop {

    public static ItemStack ItemRandom(Player p) {
        int chance = (int) (Math.random()*((100-1)+1))+1;
        return ItemAssembler(chance, p);
    }

	private static ItemStack ItemAssembler(int chance, Player p) {
		ItemStack asmitem = new ItemStack(Material.AIR, 1);
		if (chance == 1){
			asmitem.setType(Material.DIAMOND);
            p.sendMessage(ChatColor.GREEN + "Вы получили: Алмаз из: Обычный Кейс");
            Bukkit.broadcastMessage(ChatColor.RED + "╔ " + p.getName() + " открыл Обычный Кейс и получил:");
            Bukkit.broadcastMessage(ChatColor.RED + "╠ " + "1х Алмаз!");
            Bukkit.broadcastMessage(ChatColor.RED + "╚ " + "Хочешь так же? Тебе на knazcraft.ru");
		}
		else if (chance == 2){
			asmitem.setType(Material.EMERALD);
            p.sendMessage(ChatColor.GREEN + "Вы получили: пзумруд из: Обычный Кейс");
            Bukkit.broadcastMessage(ChatColor.RED + "╔ " + p.getName() + " открыл Обычный Кейс и получил:");
            Bukkit.broadcastMessage(ChatColor.RED + "╠ " + "1х Изумруд!");
            Bukkit.broadcastMessage(ChatColor.RED + "╚ " + "Хочешь так же? Тебе на knazcraft.ru");
		}
		else if (3<=chance && 4>=chance){
			asmitem.setType(Material.SADDLE);
            p.sendMessage(ChatColor.GREEN + "Вы получили: Седло из: Обычный Кейс");
            Bukkit.broadcastMessage(ChatColor.RED + "╔ " + p.getName() + " открыл Обычный Кейс и получил:");
            Bukkit.broadcastMessage(ChatColor.RED + "╠ " + "1х Седло!");
            Bukkit.broadcastMessage(ChatColor.RED + "╚ " + "Хочешь так же? Тебе на knazcraft.ru");
		}
		else if (5<=chance && 10>=chance){
			asmitem.setType(Material.IRON_INGOT);
			asmitem.setAmount(2);
            p.sendMessage(ChatColor.GREEN + "Вы получили: 2 Железный Слиток из: Обычный Кейс");
            Bukkit.broadcastMessage(ChatColor.RED + "╔ " + p.getName() + " открыл Обычный Кейс и получил:");
            Bukkit.broadcastMessage(ChatColor.RED + "╠ " + "2х Железный Слиток!");
            Bukkit.broadcastMessage(ChatColor.RED + "╚ " + "Хочешь так же? Тебе на knazcraft.ru");
		}
		else if (11<=chance && 15>=chance){
			asmitem.setType(Material.IRON_INGOT);
            p.sendMessage(ChatColor.GREEN + "Вы получили: Железный Слиток из: Обычный Кейс");
            Bukkit.broadcastMessage(ChatColor.RED + "╔ " + p.getName() + " открыл Обычный Кейс и получил:");
            Bukkit.broadcastMessage(ChatColor.RED + "╠ " + "1х Железный Слиток!");
            Bukkit.broadcastMessage(ChatColor.RED + "╚ " + "Хочешь так же? Тебе на knazcraft.ru");
		}
		else if (16<=chance && 20>=chance){
			asmitem.setType(Material.GOLD_INGOT);
            p.sendMessage(ChatColor.GREEN + "Вы получили: Золотой Слиток из: Обычный Кейс");
            Bukkit.broadcastMessage(ChatColor.RED + "╔ " + p.getName() + " открыл Обычный Кейс и получил:");
            Bukkit.broadcastMessage(ChatColor.RED + "╠ " + "1х Золотой Слиток!");
            Bukkit.broadcastMessage(ChatColor.RED + "╚ " + "Хочешь так же? Тебе на knazcraft.ru");
		}
		else if (21<=chance && 25>=chance){
			asmitem.setType(Material.GOLD_INGOT);
			asmitem.setAmount(2);
            p.sendMessage(ChatColor.GREEN + "Вы получили: 2 Золотой Слиток из: Обычный Кейс");
            Bukkit.broadcastMessage(ChatColor.RED + "╔ " + p.getName() + " открыл Обычный Кейс и получил:");
            Bukkit.broadcastMessage(ChatColor.RED + "╠ " + "2х Золотой Слиток!");
            Bukkit.broadcastMessage(ChatColor.RED + "╚ " + "Хочешь так же? Тебе на knazcraft.ru");
		}
		else if (26<=chance && 30>=chance){
			asmitem.setType(Material.REDSTONE);
			asmitem.setAmount(8);
            p.sendMessage(ChatColor.GREEN + "Вы получили: 8 Редстоун из: Обычный Кейс");
            Bukkit.broadcastMessage(ChatColor.RED + "╔ " + p.getName() + " открыл Обычный Кейс и получил:");
            Bukkit.broadcastMessage(ChatColor.RED + "╠ " + "8х Редстоун!");
            Bukkit.broadcastMessage(ChatColor.RED + "╚ " + "Хочешь так же? Тебе на knazcraft.ru");
		}
		else if (31<=chance && 35>=chance){
			asmitem.setType(Material.REDSTONE);
			asmitem.setAmount(16);
            p.sendMessage(ChatColor.GREEN + "Вы получили: 16 Редстоун из: Обычный Кейс");
            Bukkit.broadcastMessage(ChatColor.RED + "╔ " + p.getName() + " открыл Обычный Кейс и получил:");
            Bukkit.broadcastMessage(ChatColor.RED + "╠ " + "16х Редстоун!");
            Bukkit.broadcastMessage(ChatColor.RED + "╚ " + "Хочешь так же? Тебе на knazcraft.ru");
		}
		else if (36<=chance && 40>=chance){
			asmitem.setType(Material.LAPIS_LAZULI);
			asmitem.setAmount(8);
            p.sendMessage(ChatColor.GREEN + "Вы получили: 8 Лазурит из: Обычный Кейс");
            Bukkit.broadcastMessage(ChatColor.RED + "╔ " + p.getName() + " открыл Обычный Кейс и получил:");
            Bukkit.broadcastMessage(ChatColor.RED + "╠ " + "8х Лазурит!");
            Bukkit.broadcastMessage(ChatColor.RED + "╚ " + "Хочешь так же? Тебе на knazcraft.ru");
		}
		else if (41<=chance && 50>=chance){
			asmitem.setType(Material.COAL);
			asmitem.setAmount(8);
            p.sendMessage(ChatColor.GREEN + "Вы получили: 8 Уголь из: Обычный Кейс");
            Bukkit.broadcastMessage(ChatColor.RED + "╔ " + p.getName() + " открыл Обычный Кейс и получил:");
            Bukkit.broadcastMessage(ChatColor.RED + "╠ " + "8х Уголь!");
            Bukkit.broadcastMessage(ChatColor.RED + "╚ " + "Хочешь так же? Тебе на knazcraft.ru");
		}
		else if (51<=chance && 60>=chance){
			asmitem.setType(Material.QUARTZ);
			asmitem.setAmount(8);
            p.sendMessage(ChatColor.GREEN + "Вы получили: 8 Кварц из: Обычный Кейс");
            Bukkit.broadcastMessage(ChatColor.RED + "╔ " + p.getName() + " открыл Обычный Кейс и получил:");
            Bukkit.broadcastMessage(ChatColor.RED + "╠ " + "8х Кварц!");
            Bukkit.broadcastMessage(ChatColor.RED + "╚ " + "Хочешь так же? Тебе на knazcraft.ru");
		}
		else if (61<=chance && 70>=chance){
			asmitem.setType(Material.COAL);
			asmitem.setAmount(16);
            p.sendMessage(ChatColor.GREEN + "Вы получили: 16 Уголь из: Обычный Кейс");
            Bukkit.broadcastMessage(ChatColor.RED + "╔ " + p.getName() + " открыл Обычный Кейс и получил:");
            Bukkit.broadcastMessage(ChatColor.RED + "╠ " + "16х Уголь!");
            Bukkit.broadcastMessage(ChatColor.RED + "╚ " + "Хочешь так же? Тебе на knazcraft.ru");
		}
		else if (71<=chance && 85>=chance){
			asmitem.setType(Material.STONE);
			asmitem.setAmount(64);
            p.sendMessage(ChatColor.GREEN + "Вы получили: 64 Камень из: Обычный Кейс");
            Bukkit.broadcastMessage(ChatColor.RED + "╔ " + p.getName() + " открыл Обычный Кейс и получил:");
            Bukkit.broadcastMessage(ChatColor.RED + "╠ " + "64х Камень!");
            Bukkit.broadcastMessage(ChatColor.RED + "╚ " + "Хочешь так же? Тебе на knazcraft.ru");
		}
		else if (86<=chance && 100>=chance){
			asmitem.setType(Material.COBBLESTONE);
			asmitem.setAmount(64);
			p.sendMessage(ChatColor.GREEN + "Вы получили: 64 Булыжник из: Обычный Кейс");
            Bukkit.broadcastMessage(ChatColor.RED + "╔ " + p.getName() + " открыл Обычный Кейс и получил:");
            Bukkit.broadcastMessage(ChatColor.RED + "╠ " + "64х Булыжник!");
            Bukkit.broadcastMessage(ChatColor.RED + "╚ " + "Хочешь так же? Тебе на knazcraft.ru");
		}
		return asmitem;
	}

}
