package com.patterns.factories.modelfactory;

public enum UserEnum {
    CLIENT("CLIENT"), DRIVER("DRIVER");

    private final String type;

    UserEnum(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
