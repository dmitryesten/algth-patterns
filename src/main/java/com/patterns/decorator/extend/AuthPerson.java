package com.patterns.decorator.extend;

public class AuthPerson extends AbstractAuthPerson {
    @Override
    public void auth() {
        System.out.println("Простоая авторизация пользователя / Simple person auth");
    }
}
