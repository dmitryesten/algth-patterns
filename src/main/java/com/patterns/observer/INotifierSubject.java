package com.patterns.observer;

public interface INotifierSubject {

    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyAllObservers();

}
