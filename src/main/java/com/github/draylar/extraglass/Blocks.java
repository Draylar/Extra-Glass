package com.github.draylar.extraglass;

import com.github.draylar.extraglass.glass.blocks.clear.ClearGlass;
import com.github.draylar.extraglass.glass.blocks.clear.StainedClearGlass;
import com.github.draylar.extraglass.glass.blocks.darkened.DarkenedGlass;
import com.github.draylar.extraglass.glass.blocks.darkened.StainedDarkenedGlass;
import com.github.draylar.extraglass.glass.blocks.incorporeal.IncorporealGlass;
import com.github.draylar.extraglass.glass.blocks.incorporeal.StainedIncorporealGlass;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;

public class Blocks
{
    public static ClearGlass clearGlass = new ClearGlass("clear_glass");
    public static StainedClearGlass stainedClearGlass = new StainedClearGlass("stained_clear_glass");

    public static IncorporealGlass incorporealGlass = new IncorporealGlass("incorporeal_glass");
    public static StainedIncorporealGlass stainedIncorporealGlass = new StainedIncorporealGlass("stained_incorporeal_glass");

    public static DarkenedGlass darkenedGlass = new DarkenedGlass("darkened_glass");
    public static StainedDarkenedGlass stainedDarkenedGlass = new StainedDarkenedGlass("stained_darkened_glass");

    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(
                clearGlass,
                incorporealGlass,
                stainedClearGlass,
                stainedIncorporealGlass,
                darkenedGlass,
                stainedDarkenedGlass
        );
    }
}
