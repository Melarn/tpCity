package me.melarn.tpcity;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ClickEvent implements Listener {

    @EventHandler
    public void onClickEvent(InventoryClickEvent e) {

        Player player = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equals(ChatColor.BLUE + "teleport po gorodam")) {
            switch (e.getCurrentItem().getType()) {
                case BOWL:
                    player.closeInventory();
                    player.teleport(new Location(player.getWorld(), 935, 62, -287));
                    player.sendMessage("Вы были телепортированы в" + "NNcity");
                    break;
                case CARROT:
                    player.closeInventory();
                    player.teleport(new Location(player.getWorld(), 936, 62, -287));
                    player.sendMessage("Вы были телепортированы в" + "NNcity");
                    break;
                case TNT_MINECART:
                    player.closeInventory();
                    player.teleport(new Location(player.getWorld(), 937, 62, -287));
                    player.sendMessage("Вы были телепортированы в" + "NNcity");
                    break;
            }
            e.setCancelled(true);
        }
    }
}
