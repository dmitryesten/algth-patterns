package com.patterns.factories.factorymethod;

import com.patterns.factories.InstanseNotFoundException;
import com.patterns.factories.modelfactory.Client;
import com.patterns.factories.modelfactory.UserEnum;
import com.patterns.factories.modelfactory.UserSystem;
import org.junit.Assert;
import org.junit.Test;

public class UserSystemFactoryTest {

    @Test
    public void getInstance() throws InstanseNotFoundException, InstanseNotFoundException {
        UserSystem actualUser = new Client();
        Assert.assertTrue(UserSystemFactory.getInstance(UserEnum.CLIENT) instanceof UserSystem);
    }

    @Test
    public void testGetInstance() throws InstanseNotFoundException {
        UserSystem actualUser = new Client();
        Assert.assertTrue(UserSystemFactory.getInstance("DRIVER") instanceof UserSystem);
    }

}