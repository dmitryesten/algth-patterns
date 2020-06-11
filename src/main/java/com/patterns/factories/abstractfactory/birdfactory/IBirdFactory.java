package com.patterns.factories.abstractfactory.birdfactory;

import com.patterns.factories.InstanseNotFoundException;
import com.patterns.factories.abstractfactory.birdfactory.modelbird.IChicken;
import com.patterns.factories.abstractfactory.birdfactory.modelbird.IDuck;

public interface IBirdFactory {

    IChicken createChicken(String color) throws InstanseNotFoundException;
    IDuck createDuck(String color) throws InstanseNotFoundException;

}
