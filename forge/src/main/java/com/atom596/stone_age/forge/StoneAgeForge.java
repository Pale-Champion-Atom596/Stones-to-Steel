package com.atom596.stone_age.forge;

import dev.architectury.platform.forge.EventBuses;
import com.atom596.stone_age.StoneAge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(StoneAge.MOD_ID)
public class StoneAgeForge {
    public StoneAgeForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(StoneAge.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        StoneAge.init();
    }
}
