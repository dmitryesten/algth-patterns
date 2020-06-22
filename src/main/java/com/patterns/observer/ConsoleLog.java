package com.patterns.observer;

public class ConsoleLog implements IObserver {

    public String message;
    public String stateNotifier;
    private INotifierSubject notifierSubject;

    public ConsoleLog(String stateNotifier){
        this.stateNotifier = stateNotifier;
    }

    public ConsoleLog() {
        this("Default MessageLog");
    }

    @Override
    public void updateMessageLog(String stateNotifier) {
        System.out.println(this.stateNotifier + "update notifier's old state = " + this.stateNotifier + " new state of notifier" + stateNotifier);
        this.stateNotifier = stateNotifier;
    }

}
