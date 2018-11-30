package com.github.draylar.extraglass.glass.blocks.darkened;

import com.github.draylar.extraglass.glass.GlassBase;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class DarkenedGlass extends GlassBase
{
    public DarkenedGlass(String name)
    {
        super(name);
    }

    @Override
    public float getBlockHardness(IBlockState blockState, World worldIn, BlockPos pos)
    {
        return 0.3f;
    }

    @Override
    protected boolean canSilkHarvest()
    {
        return true;
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

        if (blockState != secondBlockState)
        {
            return true;
        }

        if (block == this)
        {
            return false;
        }

        return true;
    }
}
