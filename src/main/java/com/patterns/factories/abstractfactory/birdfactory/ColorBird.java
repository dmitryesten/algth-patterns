package com.patterns.factories.abstractfactory.birdfactory;

public enum ColorBird {
    YELLOW("yellow"), WHITE("white"), BLACK("black");

    public String getColor() {
        return color;
    }

    private String color;

    ColorBird(String color){
        this.color = color;
    }
}
