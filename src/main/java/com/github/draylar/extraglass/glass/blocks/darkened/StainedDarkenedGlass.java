package com.github.draylar.extraglass.glass.blocks.darkened;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStainedGlass;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class StainedDarkenedGlass extends BlockStainedGlass
{
    public StainedDarkenedGlass(String name)
    {
        super(Material.GLASS);
        this.setRegistryName(name);
        this.setTranslationKey(name);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }

    @Override
    public SoundType getSoundType()
    {
        return SoundType.GLASS;
    }

    @Override
    public float getBlockHardness(IBlockState blockState, World worldIn, BlockPos pos)
    {
        return 0.3f;
    }

    @Override
    public int getLightOpacity(IBlockState state)
    {
        return 100;
    }

    @Override
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
    {
        IBlockState secondBlockState = blockAccess.getBlockState(pos.offset(side));
        Block block = secondBlockState.getBlock();

        if (blockState != secondBlockState) return true;
        return block != this;
    }
}
