package net.mofucraft.nbtviewer;

import org.bukkit.craftbukkit.v1_20_R3.inventory.CraftItemStack;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Action {

    public void showNbt(Player player) {

        //Get NBT
        ItemStack stack = player.getInventory().getItemInMainHand();
        net.minecraft.world.item.ItemStack CBStack = CraftItemStack.asNMSCopy(stack);
        String nbtStr = CBStack.v().toString();
        player.sendMessage(nbtStr);

    }

}
