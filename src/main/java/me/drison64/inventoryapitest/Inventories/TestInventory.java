package me.drison64.inventoryapitest.Inventories;

import me.drison64.inventoryapi.CustomInventory;
import me.drison64.inventoryapi.ItemStackUtils;
import org.bukkit.Material;
import org.bukkit.event.Event;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.HashMap;

public class TestInventory extends CustomInventory {

    @Override
    protected void init(HashMap<Integer, ItemStack> items) {
        set(0, ItemStackUtils.mkitem(1, Material.STONE, "cunt", Arrays.asList("")));
        title = "cockity cock";
        size = 54;
    }

    @Override
    protected void fire(Event event) {
        if (event instanceof InventoryOpenEvent) {
            InventoryOpenEvent e = (InventoryOpenEvent) event;
            e.getPlayer().sendMessage("cockity cock yaay");
        }
    }

}
