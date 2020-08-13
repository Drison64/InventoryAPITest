package me.drison64.inventoryapitest;

import me.drison64.inventoryapi.EventListener;
import me.drison64.inventoryapi.InventoryAPI;
import me.drison64.inventoryapitest.Inventories.TestInventory;
import me.drison64.inventoryapitest.Listeners.PlayerListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private TestInventory testInventory;

    @Override
    public void onEnable() {

        InventoryAPI inventoryAPI = new InventoryAPI();

        Bukkit.getPluginManager().registerEvents(new EventListener(inventoryAPI), this);

        testInventory = new TestInventory();

        Bukkit.getPluginManager().registerEvents(new PlayerListener(this), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public TestInventory getTestInventory() {
        return testInventory;
    }

}
