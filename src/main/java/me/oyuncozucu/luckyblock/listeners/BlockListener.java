package me.oyuncozucu.luckyblock.listeners;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BlockListener implements Listener {

    @EventHandler
    public void onBlock(BlockBreakEvent e) {

        World world = e.getBlock().getWorld();

        Block block = e.getBlock();

        if(block.getType().equals(Material.SPONGE)) {

            List<Material> blockList = new ArrayList<>(Arrays.asList(Material.values()));

            Material randomBlock =
                    blockList.get(new Random().nextInt(blockList.size()));


            e.setDropItems(false);

            world.dropItemNaturally(e.getBlock().getLocation(), new ItemStack(randomBlock));
        }

    }

}
