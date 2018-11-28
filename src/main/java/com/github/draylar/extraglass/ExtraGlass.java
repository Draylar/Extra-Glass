package com.github.draylar.extraglass;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

@Mod(
        modid = ExtraGlass.MOD_ID,
        name = ExtraGlass.MOD_NAME,
        version = ExtraGlass.VERSION
)
public class ExtraGlass
{

    public static final String MOD_ID = "extraglass";
    public static final String MOD_NAME = "Extra Glass";
    public static final String VERSION = "1.0-SNAPSHOT";

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(MOD_ID)
    public static ExtraGlass INSTANCE;


    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {

    }

    /**
     * This is the second initialization event. Register custom recipes
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    /**
     * This is the final initialization event. Register actions from other mods here
     */
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {

    }


    /**
     * This is a special class that listens to registry events, to allow creation of mod blocks and items at the proper time.
     */
    @Mod.EventBusSubscriber
    public static class ObjectRegistryHandler
    {
        /**
         * Listen for the register event for creating custom items
         */
        @SubscribeEvent
        public static void addItems(RegistryEvent.Register<Item> event)
        {
           Items.registerItemBlocks(event);
        }

        /**
         * Listen for the register event for creating custom blocks
         */
        @SubscribeEvent
        public static void addBlocks(RegistryEvent.Register<Block> event)
        {
            Blocks.registerBlocks(event);
        }

        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event)
        {
            Items.registerModels();
        }
    }

    public static void registerModel(Item item, String itemName) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(MOD_ID + ":" + itemName, "inventory"));
    }

    public static void registerModel(Item item, String itemName, int metadata) {
        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(MOD_ID + ":" + itemName, "inventory"));
    }
}
