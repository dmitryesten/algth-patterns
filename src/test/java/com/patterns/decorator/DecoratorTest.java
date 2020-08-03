package com.patterns.decorator;

import com.patterns.decorator.extend.AbstractAuthDecorator;
import com.patterns.decorator.extend.AbstractAuthPerson;
import com.patterns.decorator.extend.AuthPerson;
import com.patterns.decorator.extend.FacebookAuthDecorator;
import com.patterns.decorator.implement.ICallTaxi;
import org.junit.Test;

import java.io.FileNotFoundException;

public class DecoratorTest {

    @Test
    public void extend() throws FileNotFoundException {

        AbstractAuthPerson person = new AuthPerson();
        person.auth();
        AbstractAuthDecorator decorator = new FacebookAuthDecorator(person);
        decorator.socialWebAuth();

        decorator.auth();

    }

}