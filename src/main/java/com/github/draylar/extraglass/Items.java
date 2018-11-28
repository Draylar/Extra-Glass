package com.github.draylar.extraglass;

import com.github.draylar.extraglass.glass.items.ItemStainedClearGlass;
import com.github.draylar.extraglass.glass.items.ItemStainedDarkenedGlass;
import com.github.draylar.extraglass.glass.items.ItemStainedIncorporealGlass;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;

public class Items
{
    public static Item clearGlass = new ItemBlock(Blocks.clearGlass).setRegistryName(Blocks.clearGlass.getRegistryName());
    public static Item stainedClearGlass = new ItemStainedClearGlass(Blocks.stainedClearGlass).setRegistryName(Blocks.stainedClearGlass.getRegistryName());

    public static Item incorporealGlass = new ItemBlock(Blocks.incorporealGlass).setRegistryName(Blocks.incorporealGlass.getRegistryName());
    public static Item stainedIncorporealGlass = new ItemStainedIncorporealGlass(Blocks.stainedIncorporealGlass).setRegistryName(Blocks.stainedIncorporealGlass.getRegistryName());

    public static Item darkenedGlass = new ItemBlock(Blocks.darkenedGlass).setRegistryName(Blocks.darkenedGlass.getRegistryName());
    public static Item stainedDarkenedGlass = new ItemStainedDarkenedGlass(Blocks.stainedDarkenedGlass).setRegistryName(Blocks.stainedDarkenedGlass.getRegistryName());

    public static void registerItemBlocks(RegistryEvent.Register<Item> event)
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

    public static void registerModels()
    {
        ExtraGlass.registerModel(clearGlass, "clear_glass");
        ExtraGlass.registerModel(incorporealGlass, "incorporeal_glass");
        ExtraGlass.registerModel(darkenedGlass, "darkened_glass");

        registerStainedClearGlassVariants();
        registerStainedIncorporealGlassVariants();
        registerStainedDarkenedGlassVariants();
    }

    public static void registerStainedClearGlassVariants()
    {
        for (int i = 0; i <= 15; i++)
        {
            String color = EnumDyeColor.byMetadata(i) + "";

            // change silver to light gray and lightBlue to light_blue
            if(color.equals("silver")) color = "light_gray";
            if(color.equals("lightBlue")) color = "light_blue";

            ExtraGlass.registerModel(stainedClearGlass, "stained_clear/" + color + "_stained_clear_glass", i);
        }
    }

    public static void registerStainedIncorporealGlassVariants()
    {
        for (int i = 0; i <= 15; i++)
        {
            String color = EnumDyeColor.byMetadata(i) + "";

            // change silver to light gray and lightBlue to light_blue
            if(color.equals("silver")) color = "light_gray";
            if(color.equals("lightBlue")) color = "light_blue";

            ExtraGlass.registerModel(stainedIncorporealGlass, "stained_incorporeal/" + color + "_stained_incorporeal_glass", i);
        }
    }

    public static void registerStainedDarkenedGlassVariants()
    {
        for (int i = 0; i <= 15; i++)
        {
            String color = EnumDyeColor.byMetadata(i) + "";

            // change silver to light gray and lightBlue to light_blue
            if(color.equals("silver")) color = "light_gray";
            if(color.equals("lightBlue")) color = "light_blue";

            ExtraGlass.registerModel(stainedDarkenedGlass, "stained_darkened/" + color + "_stained_darkened_glass", i);
        }
    }
}
