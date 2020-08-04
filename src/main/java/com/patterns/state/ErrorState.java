package com.patterns.state;

public class ErrorState extends Exception implements IState {

    private static final RouteStateEnum status = RouteStateEnum.ERROR_ROUTING;

    public ErrorState(Exception e){
        super(e);
    }

    @Override
    public void checkSentPhone(CallRouting callRouting) {

    }

    @Override
    public RouteStateEnum getStatusState() {
        return ErrorState.status;
    }

    @Override
    public String getDescriptionContext() {
        return getMessage();
    }

}
