package com.atom596.stone_age.fabric;

import com.atom596.stone_age.StoneAge;
import net.fabricmc.api.ModInitializer;

public class StoneAgeFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        StoneAge.init();
    }
}
