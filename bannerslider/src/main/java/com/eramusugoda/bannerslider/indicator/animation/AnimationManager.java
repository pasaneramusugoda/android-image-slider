package com.eramusugoda.bannerslider.indicator.animation;

import androidx.annotation.NonNull;

import com.eramusugoda.bannerslider.indicator.animation.controller.AnimationController;
import com.eramusugoda.bannerslider.indicator.animation.controller.ValueController;
import com.eramusugoda.bannerslider.indicator.draw.data.Indicator;


public class AnimationManager {

    private AnimationController animationController;

    public AnimationManager(@NonNull Indicator indicator, @NonNull ValueController.UpdateListener listener) {
        this.animationController = new AnimationController(indicator, listener);
    }

    public void basic() {
        if (animationController != null) {
            animationController.end();
            animationController.basic();
        }
    }

    public void interactive(float progress) {
        if (animationController != null) {
            animationController.interactive(progress);
        }
    }

    public void end() {
        if (animationController != null) {
            animationController.end();
        }
    }
}
