package com.atom596.stone_age.common.items;

import com.atom596.stone_age.StoneAge;
import com.atom596.stone_age.common.items.bone_tools.BoneDagger;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ItemCommon {

    public static final Item TEST_ITEM = new Item(new Item.Properties().tab(StoneAge.STONE_AGE));

    public static void registerItems() {

        Registry.register(Registry.ITEM, new ResourceLocation(StoneAge.MOD_ID, "test_item"), TEST_ITEM);
        Registry.register(Registry.ITEM, new ResourceLocation(StoneAge.MOD_ID, "bone_dagger"), BoneDagger.BONE_DAGGER);
    }
}
