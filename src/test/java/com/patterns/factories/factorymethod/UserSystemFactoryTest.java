package com.patterns.factory.factorymethod;

import com.patterns.factory.InstanseNotFoundException;
import com.patterns.factory.modelfactory.Client;
import com.patterns.factory.modelfactory.Driver;
import com.patterns.factory.modelfactory.UserEnum;
import com.patterns.factory.modelfactory.UserSystem;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

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