package org.edgegamers.picklez.main;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.entity.EntityDeathEvent;
import org.mineacademy.fo.plugin.SimplePlugin;

public class EdgeDrops extends SimplePlugin {

    @Override
    public void onPluginStart() {
        getLogger().info("Plugin has been enabled successfully!");
        getLogger().info("Made by PickleZ, for EdgeGamers Organization");
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onEntityDeath(final EntityDeathEvent death) {
        Entity killer = death.getEntity().getKiller();
        Entity deather = death.getEntity();

        /*if(!(killer instanceof Player) && !(deather instanceof Player)) {
          c  death.getDrops().clear();
            death.setDroppedExp(0);/*

         */
        death.getDrops().clear();
        death.setDroppedExp(0);

        }
    }



