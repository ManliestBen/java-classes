package com.benmanley.oop.intro;

public class Person {
    private int id;
    private String name;
    private String address;
    public void setAddress(String address) {
        this.address = address;
    }
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override public String toString() {
        return "This is " + name + " who lives at " + address;
    }
}
