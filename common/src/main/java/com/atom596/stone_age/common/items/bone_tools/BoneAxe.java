package com.atom596.stone_age.common.items.bone_tools;

import com.atom596.stone_age.StoneAge;
import net.minecraft.world.item.AxeItem;

public class BoneAxe extends AxeItem {
    public static final BoneAxe BONE_AXE = new BoneAxe();

    public BoneAxe() {
        super(new BoneToolTier(), 3, 0.5f, new Properties().tab(StoneAge.STONE_AGE));
    }
}
