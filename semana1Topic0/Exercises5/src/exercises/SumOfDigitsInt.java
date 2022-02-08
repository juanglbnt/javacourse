package exercises;

import java.util.Scanner;

public class SumOfDigitsInt {

    public static void sumDigits(){
        int number, digit;
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("enter a positive int: ");
        number = scan.nextInt();

        while(number > 0){
            digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.printf("the sum of the digits is: %d", sum);
    }
}
