package com.patterns.state;

public interface IState {

    void checkSentPhone(CallRouting callRouting);

    RouteStateEnum getStatusState();

    String getDescriptionContext();

}
