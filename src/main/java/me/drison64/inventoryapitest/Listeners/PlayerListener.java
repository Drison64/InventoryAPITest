package me.drison64.inventoryapitest.Listeners;

import me.drison64.inventoryapitest.Inventories.TestInventory;
import me.drison64.inventoryapitest.Main;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener {

    private Main main;

    public PlayerListener(Main main) {
        this.main = main;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        main.getInventoryManager().open(new TestInventory(Bukkit.getWorld("world").getBlockAt(0, 20, 0)), e.getPlayer());
    }

}
