package com.benmanley.oop.intro;

public class Main{
    public static void main(String[] args) {
        Person benManley = new Person("Ben Manley", "123 N Main St");
        benManley.setAddress("678 E Wickersham Blvd");
//        System.out.println(benManley.toString());
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(32, 23));
    }
}
