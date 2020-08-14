package me.drison64.inventoryapitest;

import me.drison64.inventoryapi.InventoryAPI;
import me.drison64.inventoryapi.InventoryManager;
import me.drison64.inventoryapitest.Inventories.TestInventory;
import me.drison64.inventoryapitest.Listeners.PlayerListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private InventoryManager inventoryManager;

    @Override
    public void onEnable() {

        InventoryAPI inventoryAPI = new InventoryAPI(this);

        this.inventoryManager = inventoryAPI.getInventoryManager();

        Bukkit.getPluginManager().registerEvents(new PlayerListener(this), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public InventoryManager getInventoryManager() {
        return inventoryManager;
    }

}
