package com.atom596.stone_age.nbb;
// Code stolen from https://github.com/alcatrazEscapee/no-tree-punching

import com.atom596.stone_age.common.ModTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.Nullable;

/**
 * This represents a primary tool that must be present on a given block
 * Blocks can be added to any number of tags to determine their validity with such a tool
 * However, all blocks have a fallback 'tool type' which is known to NTP
 * This is because when we check if a block is harvestable by an item, we have no way of knowing if that block is harvestable by *any* item.
 */
public enum ToolType
{
    PICKAXE(ModTags.Items.PICKAXE_TOOLS), // Stone
    AXE(ModTags.Items.AXE_TOOLS), // Wood
    SHOVEL(ModTags.Items.SHOVEL_TOOLS), // Earth, Dirt
    HOE(ModTags.Items.HOE_TOOLS), // Plants, Misc.
    SHARP(ModTags.Items.SHARP_TOOLS), // (Of Swords and Axes) Plants
    UNIQUE(null),
    NONE(null);

    @Nullable private final TagKey<Item> tag;

    ToolType(@Nullable TagKey<Item> tag)
    {
        this.tag = tag;
    }

    public boolean is(Item item)
    {
        return tag != null && item.builtInRegistryHolder().is(tag);
    }
}
