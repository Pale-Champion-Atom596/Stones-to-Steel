package com.atom596.stone_age.common.items;

import com.atom596.stone_age.StoneAge;
import com.atom596.stone_age.common.items.bone_tools.BoneAxe;
import com.atom596.stone_age.common.items.bone_tools.BoneDagger;
import com.atom596.stone_age.common.items.bone_tools.BonePickaxe;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;

public class ItemCommon {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(StoneAge.MOD_ID, Registry.ITEM_REGISTRY);

    public static final RegistrySupplier<Item> TEST_ITEM = ITEMS.register("test_item", () ->
            new Item(new Item.Properties().tab(StoneAge.STONE_AGE)));
    public static final RegistrySupplier<Item> BONE_DAGGER = ITEMS.register("bone_dagger", () ->
            BoneDagger.BONE_DAGGER);
    public static final RegistrySupplier<Item> BONE_PICKAXE = ITEMS.register("bone_pickaxe", () ->
            BonePickaxe.BONE_PICKAXE);
    public static final RegistrySupplier<Item> BONE_AXE = ITEMS.register("bone_axe", () ->
            BoneAxe.BONE_AXE);
}
