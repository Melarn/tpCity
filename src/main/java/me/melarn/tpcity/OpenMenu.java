package me.melarn.tpcity;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class OpenMenu implements CommandExecutor {
    private String invName = ChatColor.BLUE + "teleport po gorodam";

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player player)) {
            sender.sendMessage("Not a player");
            return true;
        }
        Inventory inventory = Bukkit.createInventory(player, 9 * 3, invName);

        inventory.setItem(11, getItem(new ItemStack(Material.BOWL), ChatColor.DARK_AQUA + "nNcity"));
        inventory.setItem(13, getItem(new ItemStack(Material.TNT_MINECART), ChatColor.RED + "hzCheZaGorod"));
        inventory.setItem(15, getItem(new ItemStack(Material.CARROT), ChatColor.BLUE + "zhitomir"));
//        ItemStack hzCheZaGorod = new ItemStack(Material.TNT_MINECART);
//        ItemStack zhitomir = new ItemStack(Material.CARROT);


        player.openInventory(inventory);

        return true;
    }

    private ItemStack getItem(ItemStack item, String name) {
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        item.setItemMeta(meta);
        return item;
    }
}