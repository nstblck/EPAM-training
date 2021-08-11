package com.epam_training.persons;

public abstract class Person {
    protected String name;


    public Person(String name) {
        this.name = name;
    }

    protected Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
