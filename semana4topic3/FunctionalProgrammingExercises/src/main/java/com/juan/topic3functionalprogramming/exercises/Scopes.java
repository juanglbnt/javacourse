package com.juan.topic3functionalprogramming.exercises;

public class Scopes {

    public static void main(String[] args) {
        Scopes scopes = new Scopes();
        scopes.LocalVariable();
    }

    public void LocalVariable(){
        double number = 3;
        Operation operation = new Operation() {
            @Override
            public double computateAverage(double number1, double number2) {
                //number = number1 + number2; no se puede modificar la variable
                return number + number1 + number2;
            }
        };
        //no se puede modificar la variable, mas si se puede acceder a ella
        /*Operation operation1 = (number1, number2) -> {
            number = number1 + number2;
            return number};*/
        Operation operation2 = (number1, number2) -> {return number1 + number2 + number;};
        System.out.println(operation.computateAverage(2, 3));
        System.out.println(operation2.computateAverage(1, 2));
    }
}
