package com.patterns.builder;

import com.Gender;
import com.Person;

public class ManGenderBuilder implements  IPersonGenderBuilder {
    @Override
    public Person build() {
        return new PersonBuilder().setGender(Gender.MALE).build();
    }
}
