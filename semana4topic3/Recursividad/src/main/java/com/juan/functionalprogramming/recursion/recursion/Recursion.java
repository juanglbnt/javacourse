package com.juan.functionalprogramming.recursion.recursion;

public class Recursion {

    public static void main(String[] args) {
        int factorial;
        Recursion recursion = new Recursion();
        //recursion.print(1);

        factorial = recursion.factorial(5);
        System.out.println("factorial: " + factorial);
    }

    public void print(int x) {
        if(x <= 5) {
            System.out.print(x + " ");
            print(x + 1);
        }
    }

    public int factorial(int number) {
        if(number > 0) {
            int result = number * factorial(number - 1);
            return result;
        }
        return 1;
    }
}
