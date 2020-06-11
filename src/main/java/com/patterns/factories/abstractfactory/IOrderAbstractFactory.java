package com.patterns.factories.abstractfactory;

import com.patterns.factories.modelfactory.IUserSystem;
import com.patterns.factories.modelfactory.order.IAccount;

public interface IOrderAbstractFactory {

    IUserSystem getInstanceUser();
    IAccount getInstanceAccount();
}
