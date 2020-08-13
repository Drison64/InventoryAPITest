package me.drison64.inventoryapitest.Listeners;

import me.drison64.inventoryapitest.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;

public class PlayerListener implements Listener {

    private Main main;

    public PlayerListener(Main main) {
        this.main = main;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Inventory inventory = main.getTestInventory().build();
        e.getPlayer().openInventory(inventory);
    }

}
