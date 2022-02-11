package com.juan.topic3functionalprogramming.FunctionalInterface;

public class FunctionalInterfaceExample implements Operation{

    public static void main(String[] args) {

        FunctionalInterfaceExample functInterf = new FunctionalInterfaceExample();
        double result = functInterf.calculate(4, 5);
        System.out.println(result);
    }

    @Override
    public double calculate(double number1, double number2) {
        Operation operation = (num1, num2) -> num1 + num2;
        return operation.calculate(number1, number2);
    }
}
