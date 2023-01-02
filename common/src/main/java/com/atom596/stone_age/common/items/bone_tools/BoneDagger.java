package com.atom596.stone_age.common.items.bone_tools;

import com.atom596.stone_age.StoneAge;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class BoneDagger extends SwordItem {
    public static final BoneDagger BONE_DAGGER = new BoneDagger();

    public BoneDagger() {
        super(new BoneToolTier(), 3, 2.5f, new Properties().tab(StoneAge.STONE_AGE));
    }
}
