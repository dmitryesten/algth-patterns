package com.patterns.state;

import java.util.ArrayList;
import java.util.List;

public class MockDB {

    public static List<String> phoneDriverReference = new ArrayList<>();
    public static List<String> phoneContractorReference = new ArrayList<>();
    public static List<OrderMock> currencyOrder = new ArrayList<>();

    public MockDB(){
        phoneDriverReference.add("+79991112233");
        phoneDriverReference.add("+79997774455");

        phoneContractorReference.add("+79882225533");
        phoneContractorReference.add("+79881118899");
    }
}

class OrderMock {
    public long id;
    public String clientPhone;

    public OrderMock(long id, String clientPhone){
        this.id = id;
        this.clientPhone = clientPhone;
    }
}
