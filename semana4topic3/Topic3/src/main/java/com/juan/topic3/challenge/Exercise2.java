package com.juan.topic3.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Exercise2 {

    public Exercise2() {
    }

    public Predicate<Integer> validNumberOfTestCases = n -> n >= 1 && n <= 10;
    public Predicate<Integer> validNumberOfPasswords = n -> n >= 1 && n <= 10;

    public void getPasswords() {
        Scanner scan = new Scanner(System.in);
        int testCasesNumber;
        int numberOfPasswords;
        String password;
        List<String> passwordList = new ArrayList<>();

        do {
            System.out.print("Enter the number of cases\n" +
                    "a number between 1 and 10: ");
            testCasesNumber = scan.nextInt();

        }while (!validNumberOfTestCases.test(testCasesNumber));

        for(int i = 0; i < testCasesNumber; i++) {

            do {
                System.out.println("enter the number of passwords\n" +
                        "A number between 1 and 10: ");
                numberOfPasswords = scan.nextInt();
            }while (!validNumberOfPasswords.test(numberOfPasswords));

            System.out.println("Enter the passwords separated by enter");
            for(int j = 0; j < numberOfPasswords; j++) {
                password = scan.next();
                passwordList.add(password);
            }

        }

    }

}
