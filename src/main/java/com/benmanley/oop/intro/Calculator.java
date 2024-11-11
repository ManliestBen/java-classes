package com.benmanley.oop.intro;

public class Calculator {

//    private double result = 0; <-- Could make this more fun by adding state

    public Calculator() {

    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public double divide(double num1, double num2) {
        return num1 / num2;
    }
}
