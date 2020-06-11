package com.patterns.factories.modelfactory;

public class Driver extends UserSystem implements IUserSystem {

    private String call;

    @Override
    public boolean authorization(String login, String password) {
        return false;
    }
}
