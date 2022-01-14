package com.juan.javacourse.lesson;

import excercises1.*;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {5, 4, 7, 2, 0, 3, 1, 9, 8, 6, 10};
        int[] days = {0, 1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(HelloWorld.helloWorld());
        CheckPassFail.passFail(0);
        CheckPassFail.passFail(49);
        CheckPassFail.passFail(50);
        CheckPassFail.passFail(51);
        CheckPassFail.passFail(100);

        CheckOddEven.oddEven(0);
        CheckOddEven.oddEven(1);
        CheckOddEven.oddEven(88);
        CheckOddEven.oddEven(99);
        CheckOddEven.oddEven(-1);
        CheckOddEven.oddEven(-2);

        NumberInWord.printWithSwitch(numbers);
        NumberInWord.PrintWithNestedIf(numbers);

        PrintDayInWord dayInWord = new PrintDayInWord();
        dayInWord.DayInWordIf(days);
        dayInWord.dayInWordSwitch(days);
    }
}
