package com.patterns.decorator.extend;

public class FacebookAuthDecorator extends AbstractAuthDecorator {

    private AbstractAuthPerson abstractAuthPerson;

    public FacebookAuthDecorator(AbstractAuthPerson abstractAuthPerson) {
        this.abstractAuthPerson = abstractAuthPerson;
    }

    public void auth(){
        socialWebAuth();
        abstractAuthPerson.auth();
    }

    @Override
    public void socialWebAuth() {
        System.out.println("Mock auyth facebook");
    }

}
