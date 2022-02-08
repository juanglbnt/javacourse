package com.juan.javacourse.lesson;

import excercises.*;

public class Main {

    public static void main(String[] args) {

        Excercises4 excercises4 = new Excercises4();

        excercises4.sumAverage();
        excercises4.sumAverageUsingWhile();
        excercises4.sumAverageUsingDoWhile();
        excercises4.sumAverageRange();

        SumSquares.calculateSumSquares();
        SumOddEven.CalculateSumOddEven();
        Production.calculateProduction();
        HarmonicSum.calculateHarmonicSum();
        ComputePI.calculatePI();
        CozaLozaWoza.Print();
        CozaLozaWoza.print2();

        Fibonacci.printFibonacci();
        ExtractDigits.ExtractInReverse();

    }
}
