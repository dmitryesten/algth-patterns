package com.patterns.adapter.person;

import com.patterns.adapter.order.Order;

public interface IPerson {

    Order getOrder(int idOrder);

}
