package com.patterns.decorator.implement;

public class Call implements ICallTaxi {
    @Override
    public void call() {
        System.out.println("Call taxi");
    }
}
