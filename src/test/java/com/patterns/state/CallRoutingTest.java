package com.patterns.state;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CallRoutingTest {

    private MockDB mockDB = new MockDB();

    @Test
    public void setCallRoutingStateDriver() {
        CallRouting callRouting = new CallRouting("+79997774455");
        callRouting.processCheckCallRouting();
        Assert.assertEquals(RouteStateEnum.NO_ROUTE, callRouting.getState().getStatusState());
    }

    @Test
    public void setCallRoutingStateContractor() {
        CallRouting callRouting = new CallRouting("+79882225533");
        callRouting.processCheckCallRouting();
        Assert.assertEquals(RouteStateEnum.NO_ROUTE, callRouting.getState().getStatusState());
    }

    @Test
    public void setCallRoutingState() {
        CallRouting callRouting = new CallRouting("+79001050505");
        callRouting.processCheckCallRouting();
        Assert.assertEquals(RouteStateEnum.ROUTE_WITHOUT_WAIT, callRouting.getState().getStatusState());
    }

}