package com.github.draylar.extraglass.glass.items;

import net.minecraft.block.Block;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemStainedDarkenedGlass extends ItemBlock
{
    public ItemStainedDarkenedGlass(Block block)
    {
        super(block);
        setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int damage)
    {
        return damage;
    }


    @Override
    public String getTranslationKey(ItemStack stack)
    {
        return "tile.extraglass." + EnumDyeColor.byMetadata(getDamage(stack)) + "_stained_darkened_glass";
    }
}
