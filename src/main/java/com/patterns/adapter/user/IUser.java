package com.patterns.adapter.user;

import com.patterns.adapter.order.Order;

public interface IUser {

    Order getOrder(int idOrder);

}
