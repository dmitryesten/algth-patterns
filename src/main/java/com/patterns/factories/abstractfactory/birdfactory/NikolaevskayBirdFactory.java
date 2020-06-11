package com.patterns.factories.abstractfactory.birdfactory;

import com.patterns.factories.abstractfactory.birdfactory.modelbird.IChicken;
import com.patterns.factories.abstractfactory.birdfactory.modelbird.IDuck;

public class NikolaevskayBirdFactory implements IBirdFactory {

    @Override
    public IChicken createChicken(String color) {
        return null;
    }

    @Override
    public IDuck createDuck(String color) {
        return null;
    }


}
