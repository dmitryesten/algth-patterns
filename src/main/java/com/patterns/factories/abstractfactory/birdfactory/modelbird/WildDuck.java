package com.patterns.factories.abstractfactory.birdfactory.modelbird;

import com.patterns.factories.abstractfactory.birdfactory.ColorBird;

public class WildDuck implements IDuck {

    public ColorBird colorBird;

    public WildDuck(ColorBird colorBird) {
        this.colorBird = colorBird;
    }

    @Override
    public void kry() {
        System.out.println("Duck has " + colorBird.getColor());
    }
}
