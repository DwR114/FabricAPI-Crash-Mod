package com.example.fabricapicrash;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class FabricApiCrashMod implements ModInitializer {

    @Override
    public void onInitialize() {
        boolean hasFabricApi = FabricLoader.getInstance()
                .getModContainer("fabric")
                .isPresent();

        if (hasFabricApi) {
            throw new RuntimeException("Why did you have to do that");
        }

        System.out.println("[FabricAPI-Crash] Fabric API not found, proceeding.");
    }
}