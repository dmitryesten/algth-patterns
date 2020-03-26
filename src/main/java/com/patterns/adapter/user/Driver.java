package com.patterns.adapter.user;

import com.patterns.adapter.order.Order;
import com.patterns.adapter.order.OrderClient;
import com.patterns.adapter.order.OrderContractor;

public class Driver implements IUser {

    @Override
    public Order getOrder(int idOrder) {
        System.out.println("Driver. Get order data by id = " + idOrder);
        return (int) (Math.random()) == 1 ? new OrderClient() : new OrderContractor();
    }

}
