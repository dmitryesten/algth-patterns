package com.patterns.observer;

import org.junit.Test;

public class ObserverTest {

    @Test
    public void updateMessageLog() {

        IObserver insideLog = new ConsoleLog("InsideLog is created");
        IObserver outsideLog = new ConsoleLog();

        INotifierSubject observable = new EventNotifier();
        observable.addObserver(insideLog);



    }
}