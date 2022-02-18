package com.juan.topic3.challenge;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercise1 {

    int number;
    Double value;
    List<Double> numbers = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public Exercise1() {
    }

    public Predicate<Integer> isValidNumberEntries = number -> number >= 1 && number <= 50;
    public Predicate<Double> isValidEntry = number -> number >= -20.00 && number <= 20.00;

    public List<Double> getData() {

        do {
            System.out.print("number of calculations [1 - 50]: ");
            number = in.nextInt();
        }while (!isValidNumberEntries.test(number));

        System.out.println("Enter the values, separating by enter");
        for (int i = 0; i < number; i++) {

            do {
                value = in.nextDouble();

                if (!isValidEntry.test(value)) {
                    System.out.print("try again, value must be between [-20.00 / 20.00]\n");
                }else {
                    numbers.add(value);
                }
            }while (!isValidEntry.test(value));
        }

        return numbers;
    }

    public Function<List<Double>, List<Double>> expansionSeries =
            list -> list.stream()
                    .map(n -> calculateExSeries(n))
                    .collect(Collectors.toList());

    public void getTheExpansion() {
        List<Double> numbers = new ArrayList<>();
        List<Double> result = new ArrayList<>();
        numbers = getData();

        result = expansionSeries.apply(numbers);
        result.forEach(num -> System.out.printf("%.4f%n", num));
    }

    public Double calculateExSeries(Double value) {
        Double result = 1.0;
        int denominator = 0;
        Double numerator = 0.0;

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

}
