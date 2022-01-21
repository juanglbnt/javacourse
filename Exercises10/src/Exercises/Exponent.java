package Exercises;

import java.util.Scanner;

public class Exponent {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int exp, base;
        Exponent exponent = new Exponent();
        System.out.print("enter the base: ");
        base = in.nextInt();
        System.out.print("enter the exponent: ");
        exp = in.nextInt();

        System.out.print(base + " raised to the power of " + exp + " is: " +
                exponent.exponent(base,exp));
    }

    public int exponent(int base, int exponent){
        int product = 1;

        for(int i = 0; i < exponent; i++){
            product *= base;
        }

        return product;
    }
}
