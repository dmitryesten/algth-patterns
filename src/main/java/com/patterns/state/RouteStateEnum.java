package com.patterns.state;

public enum RouteStateEnum {

    ERROR_ROUTING("0"),
    NO_ROUTE("1"),
    ROUTE_WITHOUT_WAIT("2");


    private final String stringValue;

    RouteStateEnum(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getStringValue() {
        return stringValue;
    }

}
