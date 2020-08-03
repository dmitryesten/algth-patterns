package com.patterns.decorator.implement;

public interface IDecoratorService<T extends Call> extends ICallTaxi {

    void costService();

}
