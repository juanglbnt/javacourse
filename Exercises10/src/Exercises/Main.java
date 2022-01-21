package Exercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;
        System.out.print("enter a number: ");
        input = in.nextInt();

        if(OddEvenTest.isOdd(input)){
            System.out.print("IT'S EVEN");
        }else{
            System.out.print("IT'S ODD");
        }
    }
}
