package com.patterns.factories.abstractfactory;

import com.patterns.factories.InstanseNotFoundException;
import com.patterns.factories.abstractfactory.birdfactory.IBirdFactory;
import com.patterns.factories.abstractfactory.birdfactory.InavovskayBirdFactory;
import com.patterns.factories.abstractfactory.birdfactory.modelbird.Chicken;
import com.patterns.factories.abstractfactory.birdfactory.modelbird.WildDuck;
import org.junit.Assert;
import org.junit.Test;

public class IBirdFactoryTest {

    @Test
    public void testCreateIvanovaskayFactory() throws InstanseNotFoundException {
        IBirdFactory birdFactory = new InavovskayBirdFactory();
        Assert.assertTrue(birdFactory instanceof InavovskayBirdFactory);
        Assert.assertTrue(birdFactory.createChicken("white") instanceof Chicken);
        Assert.assertTrue(birdFactory.createDuck("yellow") instanceof WildDuck);
    }

}