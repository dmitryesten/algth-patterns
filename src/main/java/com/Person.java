package com;

import com.Gender;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private int id;
    private String nickname;
    private short age;
    private double height;
    private double weight;
    private Gender gender;

    public Person(){}

    public Person(int id, String nickname, short age, double height, double weight,  Gender gender) {
        this.id = id;
        this.nickname = nickname;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    @Override
    public int compareTo(Person person) {
        if(person.getAge() == age) {
            return 0;
        } else if (age > person.getAge()) {
            return 1;
        } else { return -1; }
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
            age == person.age &&
            Double.compare(person.height, height) == 0 &&
            Double.compare(person.weight, weight) == 0 &&
            Objects.equals(nickname, person.nickname) &&
            gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickname, age, height, weight, gender);
    }
}
