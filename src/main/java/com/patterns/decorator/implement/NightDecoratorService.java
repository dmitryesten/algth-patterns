package com.patterns.decorator.implement;

public class NightDecoratorService implements IDecoratorService {

    private ICallTaxi callTaxi;

    public NightDecoratorService(ICallTaxi call) {
        callTaxi = call;
    }

    @Override
    public void costService() {
        System.out.println("Calculate cost night service");
    }

    @Override
    public void call() {
        costService();
        callTaxi.call();
    }
}
