package com.atom596.stone_age.common.items.bone_tools;

import com.atom596.stone_age.StoneAge;
import net.minecraft.world.item.PickaxeItem;

public class BonePickaxe extends PickaxeItem {
    public static final BonePickaxe BONE_PICKAXE = new BonePickaxe();

    public BonePickaxe() {
        super(new BoneToolTier(), 3, 0.5f, new Properties().tab(StoneAge.STONE_AGE));
    }
}
