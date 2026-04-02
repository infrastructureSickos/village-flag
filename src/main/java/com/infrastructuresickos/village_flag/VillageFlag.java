package com.infrastructuresickos.village_flag;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(VillageFlag.MOD_ID)
public class VillageFlag {
    public static final String MOD_ID = "village_flag";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public VillageFlag() {
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("VillageFlag initialized");
    }
}
