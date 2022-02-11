package com.juan.topic3functionalprogramming.FunctionalInterface;

@FunctionalInterface
public interface Operation {

    double calculate(double number1, double number2);
    //esto genera error, pues la interfaz funcional solo genera un metodo
    //double calculate2();

}
