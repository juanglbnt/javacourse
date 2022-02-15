package com.juan.topic3.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {

    public Exercise1() {
    }

    public void expansionex() {
        int number;
        Double value;
        List<Double> numbers = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("number of calculations [1 - 50]: ");
            number = in.nextInt();
        }while (!isValidEntries(number));

        for (int i = 0; i < number; i++) {

            do{
                System.out.print("insert the [" + i + "] value [-20.00 - 20.00]: ");
                value = in.nextDouble();

                if (value < -20.00 || value > 20.00) {
                    System.out.print("try again, value must be between [-20.00 - 20.00]\n");
                }else {
                    numbers.add(value);
                }
            }while (!isValid(value));

        }

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
