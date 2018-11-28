package com.github.draylar.extraglass.glass.items;

import net.minecraft.block.Block;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemStainedClearGlass extends ItemBlock
{
    public ItemStainedClearGlass(Block block)
    {
        super(block);
    }

    @Override
    public int getMetadata(int damage)
    {
        return damage;
    }

    @Override
    public String getTranslationKey(ItemStack stack)
    {
        return "tile.extraglass." + EnumDyeColor.byMetadata(getDamage(stack)) + "_stained_clear_glass";
    }
}
