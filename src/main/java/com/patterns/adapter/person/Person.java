package com.patterns.adapter.person;

import com.patterns.adapter.order.Order;
import com.patterns.adapter.order.OrderClient;
import com.patterns.adapter.order.OrderContractor;
import com.patterns.adapter.person.IPerson;

public class Person implements IPerson {
    @Override
    public Order getOrder(int idOrder) {
        System.out.println("Person. Get order data by id_order = " + idOrder);
        return (int) (Math.random()) == 1 ? new OrderClient() : new OrderContractor();
    }
}
