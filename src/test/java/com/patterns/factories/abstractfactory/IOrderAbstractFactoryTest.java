package com.patterns.factories.abstractfactory;

import com.patterns.factories.modelfactory.Client;
import com.patterns.factories.modelfactory.Driver;
import com.patterns.factories.modelfactory.order.ClientAccount;
import com.patterns.factories.modelfactory.order.DriverAccount;
import org.junit.Assert;
import org.junit.Test;

public class IOrderAbstractFactoryTest {

    @Test
    public void testClient(){
        IOrderAbstractFactory objectsOrder = new ProcessExecuteOrderClient();
        Assert.assertTrue(objectsOrder.getInstanceAccount() instanceof ClientAccount);
        Assert.assertTrue(objectsOrder.getInstanceUser() instanceof Client);
    }

    @Test
    public void testDriver(){
        IOrderAbstractFactory objectsOrder = new ProcessExecuteOrderDriver();
        Assert.assertTrue(objectsOrder.getInstanceAccount() instanceof DriverAccount);
        Assert.assertTrue(objectsOrder.getInstanceUser() instanceof Driver);
    }

}