package com.patterns.adapter;

import com.patterns.adapter.order.Order;
import com.patterns.adapter.person.IPerson;
import com.patterns.adapter.user.IUser;

public class PersonAdapter implements IPerson {

    private IUser user;

    public PersonAdapter(IUser user) {
        this.user = user;
    }

    @Override
    public Order getOrder(int idOrder) {
        return user.getOrder(idOrder);
    }

}
