package com.patterns.factories.abstractfactory.birdfactory;

import com.patterns.factories.InstanseNotFoundException;
import com.patterns.factories.abstractfactory.birdfactory.modelbird.Chicken;
import com.patterns.factories.abstractfactory.birdfactory.modelbird.IChicken;
import com.patterns.factories.abstractfactory.birdfactory.modelbird.IDuck;
import com.patterns.factories.abstractfactory.birdfactory.modelbird.WildDuck;

public class InavovskayBirdFactory implements IBirdFactory {

    @Override
    public IChicken createChicken(String color) throws InstanseNotFoundException {
        switch (color) {
            case "white" : return new Chicken(ColorBird.WHITE);
            case "black" : return new Chicken(ColorBird.BLACK);
            default: throw new InstanseNotFoundException("Instance was not created by the type");
        }
    }

    @Override
    public IDuck createDuck(String color) throws InstanseNotFoundException  {
        switch (color) {
            case "white" : return new  WildDuck(ColorBird.WHITE);
            case "yellow" : return new  WildDuck(ColorBird.YELLOW);
            default: throw new InstanseNotFoundException("Instance was not created by the type");
        }
    }

}
