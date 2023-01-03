package com.atom596.stone_age;

import com.atom596.stone_age.common.items.ItemCommon;
import com.atom596.stone_age.nbb.HarvestBlockHandler;
import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class StoneAge {
    public static final String MOD_ID = "stone_age";
    public static final CreativeModeTab STONE_AGE = CreativeTabRegistry.create(new ResourceLocation(MOD_ID, "stone_age"), () ->
            new ItemStack(ItemCommon.TEST_ITEM.get()));
    
    public static void init() {
        ItemCommon.registerItems();
        HarvestBlockHandler.setup();
        
        System.out.println(ExampleExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
