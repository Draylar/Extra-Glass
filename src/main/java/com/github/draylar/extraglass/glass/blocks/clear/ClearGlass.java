package com.github.draylar.extraglass.glass.blocks.clear;

import com.github.draylar.extraglass.glass.GlassBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ClearGlass extends GlassBase
{
    public ClearGlass(String name)
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
}
