package com.github.draylar.extraglass.glass;

import net.minecraft.block.BlockGlass;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class GlassBase extends BlockGlass
{
    public GlassBase(String name)
    {
        super(Material.GLASS, true);
        this.setTranslationKey(name);
        this.setRegistryName(name);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }

    @Override
    public SoundType getSoundType()
    {
        return SoundType.GLASS;
    }
}
