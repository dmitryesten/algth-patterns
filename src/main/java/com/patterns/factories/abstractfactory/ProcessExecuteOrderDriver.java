package com.patterns.factories.abstractfactory;

import com.patterns.factories.modelfactory.Driver;
import com.patterns.factories.modelfactory.IUserSystem;
import com.patterns.factories.modelfactory.order.DriverAccount;
import com.patterns.factories.modelfactory.order.IAccount;

public class ProcessExecuteOrderDriver implements IOrderAbstractFactory {
    @Override
    public IUserSystem getInstanceUser() {
        return new Driver();
    }

    @Override
    public IAccount getInstanceAccount() {
        return new DriverAccount();
    }
}
