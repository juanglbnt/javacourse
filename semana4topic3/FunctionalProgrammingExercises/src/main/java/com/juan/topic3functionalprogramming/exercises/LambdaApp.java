package com.juan.topic3functionalprogramming.exercises;

import java.util.*;

public class LambdaApp {

    public static void main(String[] args) {
        LambdaApp lambdaApp = new LambdaApp();
        lambdaApp.organize();
        lambdaApp.calculateAverage();
    }

    public void calculateAverage(){
        //clase anonima, imperativo
        /*Operation operation = new Operation() {
            @Override
            public double computateAverage(double number1, double number2) {
                return (number1 + number2) / 2;
            }
        };
        System.out.println(operation.computateAverage(3, 4));*/

        //usando lambda
        Operation operation = (number1, number2) -> (number1 + number2) / 2;
        System.out.println(operation.computateAverage(3, 4));
    }

    public void organize(){
        List<String> listToOrder = new ArrayList<>();
        listToOrder.add("third");
        listToOrder.add("first");
        listToOrder.add("second");


        //enfoque imperativo
        /*
        Collections.sort(listToOrder, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/

        //enfoque declarativo (lambda)
        Collections.sort(listToOrder, (String param1, String param2) -> param1.compareTo(param2));

        for(String element : listToOrder){
            System.out.println(element);
        }
    }
}
