package com;

public class Person implements Comparable<Person> {

    private int id;
    private String nickname;
    private short age;
    private double height;
    private double weight;
    private Gender gender;

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

}
