package com.patterns.factories.abstractfactory;

import com.patterns.factories.modelfactory.Client;
import com.patterns.factories.modelfactory.IUserSystem;
import com.patterns.factories.modelfactory.order.ClientAccount;
import com.patterns.factories.modelfactory.order.IAccount;

public class ProcessExecuteOrderClient implements IOrderAbstractFactory {
    @Override
    public IUserSystem getInstanceUser() {
        return new Client();
    }

    @Override
    public IAccount getInstanceAccount() {
        return new ClientAccount();
    }
}
