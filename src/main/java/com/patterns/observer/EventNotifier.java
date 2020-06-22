package com.patterns.observer;

import java.util.LinkedList;
import java.util.List;

public class EventNotifier implements INotifierSubject {

    public List<IObserver> listToolObservers = new LinkedList<>();

    private String state;

    public EventNotifier(String state) {
        this.state = state;
    }

    public EventNotifier(){
        this("Default message state");
    }

    @Override
    public void addObserver(IObserver observer) {
        listToolObservers.add(observer);
        System.out.println("№№№ Adding new Observer №№№");
        notifyAllObservers();
    }

    @Override
    public void removeObserver(IObserver observer) {
        System.out.println("!!!! Dropping Observer !!!!");
        listToolObservers.remove(observer);
        notifyAllObservers();
    }

    @Override
    public void notifyAllObservers() {
        listToolObservers.stream()
            .peek(object -> System.out.println("Notify Observer" + object.toString()))
            .forEach(object -> object.updateMessageLog(this.state));
    }

    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    public String getStateNotifier() {
        return this.state;
    }

}
