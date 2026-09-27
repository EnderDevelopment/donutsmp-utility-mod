package com.rudmanfinn.donutsmputilitymod;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public
class DonutSMPUtilityScreen extends Screen {
    public DonutSMPUtilityScreen() {
        super(Text.of("DonutSMP Utility Mod"));
    }

    @Override
    protected void init() {
        this.addDrawableChild(new ButtonWidget.Builder(Text.of("Creative Flight"), button -> {
            // Toggle creative flight
        }).dimensions(this.width / 2 - 100, this.height / 2 - 60, 200, 20).build());

        this.addDrawableChild(new ButtonWidget.Builder(Text.of("Speed and Jump Controls"), button -> {
            // Toggle speed and jump controls
        }).dimensions(this.width / 2 - 100, this.height / 2 - 30, 200, 20).build());

        this.addDrawableChild(new ButtonWidget.Builder(Text.of("Fullbright/Night Vision"), button -> {
            // Toggle fullbright/night vision
        }).dimensions(this.width / 2 - 100, this.height / 2, 200, 20).build());

        this.addDrawableChild(new ButtonWidget.Builder(Text.of("Fast Mining"), button -> {
            // Toggle fast mining
        }).dimensions(this.width / 2 - 100, this.height / 2 + 30, 200, 20).build());

        this.addDrawableChild(new ButtonWidget.Builder(Text.of("Item Spawning"), button -> {
            // Toggle item spawning
        }).dimensions(this.width / 2 - 100, this.height / 2 + 60, 200, 20).build());
    }

    @Override
    public void render(net.minecraft.client.util.math.MatrixStack matrices, int mouseX, int mouseY, float delta) {
        this.renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
    }
}
