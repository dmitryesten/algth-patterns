package com.patterns.factories.abstractfactory.birdfactory.modelbird;

import com.patterns.factories.abstractfactory.birdfactory.ColorBird;

public class Chicken implements IChicken {

    public ColorBird colorBird;

    public Chicken(ColorBird colorBird){
        this.colorBird = colorBird;
    }

    @Override
    public void tsyp() {
        System.out.println("Chicken has" + colorBird.getColor());
    }

}
