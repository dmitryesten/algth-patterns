package com.patterns.factories.modelfactory;

public class Client extends UserSystem implements IUserSystem {

    private String phone;

    @Override
    public boolean authorization(String login, String password) {
        return false;
    }
}
