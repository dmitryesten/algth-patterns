package com.patterns.state;

public class RouteState implements IState {

    private static final RouteStateEnum status = RouteStateEnum.ROUTE_WITHOUT_WAIT;

    private String descriptionState;

    @Override
    public void checkSentPhone(CallRouting callRouting) {
        setDescriptionState("Перенаправлять телефон " + callRouting.getPhone() + " к оператору");
    }

    @Override
    public RouteStateEnum getStatusState() {
        return RouteState.status;
    }

    @Override
    public String getDescriptionContext() {
        return descriptionState;
    }

    private void setDescriptionState(String string){
        this.descriptionState = string;
    }

}
