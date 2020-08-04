package com.patterns.decorator.extend;

public class AuthPerson extends AbstractAuthPerson {
    @Override
    public void auth() {
        System.out.println("Simple person auth");
    }
}
