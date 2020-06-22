package com.patterns.builder;

import com.Gender;
import com.Person;

public class WomenGenderBuilder implements IPersonGenderBuilder {
    @Override
    public Person build() {
        return new PersonBuilder().setGender(Gender.FEMALE).build();
    }
}
