package exercises;

import java.util.Scanner;

public class Add2Integer {

    public static void sum(){
        int number1;
        int number2;
        int sum;

        System.out.println("******add two integers******");
        Scanner in = new Scanner(System.in);
        System.out.print("first number: ");
        number1 = in.nextInt();
        System.out.print("second number: ");
        number2 = in.nextInt();

        sum = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + sum);
    }
}
