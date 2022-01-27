package exercises;

import java.util.Scanner;

public class Swap2Integers {

    public static void swap(){
        int number1, number2, temp;
        System.out.println("\n----Swap two Integers------");
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number 1: ");
        number1 = scan.nextInt();
        System.out.print("enter the number 2: ");
        number2 = scan.nextInt();

        temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.printf("number 1 is: %d%nnumber 2 is: %d", number1, number2);
    }
}
