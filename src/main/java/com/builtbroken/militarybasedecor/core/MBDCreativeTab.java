package com.builtbroken.militarybasedecor.core;

import com.builtbroken.militarybasedecor.content.init.MBDInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MBDCreativeTab extends CreativeTabs {

    public MBDCreativeTab(String militarybasedecor) {
        super("militarybasedecor");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(MBDInit.BLOCK_FENCE_TOPPER_BLOODY);
    }
}