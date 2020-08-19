package com.patterns.state;

public class RouteStatus {

    private RouteStateEnum routeStateEnum;

    private String getDescriptionContext;

    public RouteStatus(RouteStateEnum routeStateEnum, String getDescriptionContext) {
        this.routeStateEnum = routeStateEnum;
        this.getDescriptionContext = getDescriptionContext;
    }

    public RouteStateEnum getRouteStateEnum() {
        return routeStateEnum;
    }

    public void setRouteStateEnum(RouteStateEnum routeStateEnum) {
        this.routeStateEnum = routeStateEnum;
    }

    public String getGetDescriptionContext() {
        return getDescriptionContext;
    }

    public void setGetDescriptionContext(String getDescriptionContext) {
        this.getDescriptionContext = getDescriptionContext;
    }

    @Override
    public String toString() {
        return "RouteStatus{" +
            "routeStateEnum=" + routeStateEnum +
            ", getDescriptionContext='" + getDescriptionContext + '\'' +
            '}';
    }
}
