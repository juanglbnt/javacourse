package com.juan.topic3.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {

    int number;
    Double value;
    List<Double> numbers = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public Exercise1() {
    }

    public void getData() {

        do {
            System.out.print("number of calculations [1 - 50]: ");
            number = in.nextInt();
        }while (!isValidEntries(number));

        for (int i = 0; i < number; i++) {

            do {
                System.out.print("insert the [" + i + "] value [-20.00 - 20.00]: ");
                value = in.nextDouble();

                if (value < -20.00 || value > 20.00) {
                    System.out.print("try again, value must be between [-20.00 / 20.00]\n");
                }else {
                    numbers.add(value);
                }
            }while (!isValid(value));
        }

    }

    //*****HERE
    public Double expansionImperative(Double value) {
        double result = 1.0;
        int denominator = 0;
        double numerator = 0.0;

        for(int i = 1; i <= 10; i++) {
            numerator = (Math.pow(value, i));
            denominator = factorial(i);
            result += numerator / denominator;
        }

        return result;
    }

    public int factorial(int value) {

        if(value > 0) {
           int result = value * factorial(value - 1);
           return result;
        }
        return 1;
    }

    public boolean isValid(Double number) {

        if (number >= -20.00 && number <= 20.00) {
            return true;
        }else {
            return false;
        }
    }

    public boolean isValidEntries(int entries) {

        if (entries >= 1 && entries <= 50) {
            return true;
        }else {
            return false;
        }

    }
}
