package com.patterns.adapter;

import com.patterns.adapter.order.Order;
import com.patterns.adapter.order.OrderClient;
import com.patterns.adapter.person.IPerson;
import com.patterns.adapter.user.Driver;
import com.patterns.adapter.user.IUser;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PersonAdapterTest {

    @Test
    public void test(){
        IUser user = Mockito.mock(Driver.class);
        Mockito.doReturn(new OrderClient()).when(user).getOrder(Mockito.anyInt());
        user.getOrder(123);
        Mockito.verify(user).getOrder(123);

        IPerson person = new PersonAdapter(user);
        person.getOrder(123);

    }

}