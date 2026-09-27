package com.rudmanfinn.donutsmputilitymod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public
class DonutSMPUtilityMod implements ModInitializer {
    public static final String MOD_ID = "donutsmputilitymod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static KeyBinding toggleGuiKeyBinding;

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing DonutSMP Utility Mod");
        toggleGuiKeyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
        "key.donutsmputilitymod.toggle_gui",
        InputUtil.Type.KEYSYM,
        GLFW.GLFW_KEY_R,
        "category.donutsmputilitymod.main"
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (toggleGuiKeyBinding.wasPressed()) {
                client.setScreen(new DonutSMPUtilityScreen());
            }
        });
    }
}
