package com.patterns.state;

public class NoRouteState implements IState {

    private static final RouteStateEnum status = RouteStateEnum.NO_ROUTE;

    private String descriptionState;

    @Override
    public void checkSentPhone(CallRouting callRouting) {
        try {
            if (MockDB.phoneDriverReference.stream().anyMatch(phone -> phone.equals(callRouting.getPhone()))) {
                setDescriptionState("Телефон " + callRouting.getPhone() + " принадлежит водителю");
            } else if (MockDB.phoneContractorReference.stream().anyMatch(phone -> phone.equals(callRouting.getPhone()))) {
                setDescriptionState("Телефон " + callRouting.getPhone() + " принадлежит контрагенту");
            } else {
                callRouting.setCallRoutingState(new RouteState());
            }
        } catch (Exception e) {
           callRouting.setCallRoutingState(new ErrorState(e));
        }
    }

    @Override
    public RouteStateEnum getStatusState() {
        return NoRouteState.status;
    }

    @Override
    public String getDescriptionContext() {
        return descriptionState;
    }

    private void setDescriptionState(String string){
        this.descriptionState = string;
    }

}
