package exercises;

import java.util.Scanner;

public class ReverseInt {

    public static void reverse(){
        int number;
        int digit;
        Scanner scan = new Scanner(System.in);

        System.out.print("enter a number: ");
        number = scan.nextInt();

        System.out.print("the reverse is: ");
        while(number > 0){
            digit = number % 10;
            System.out.print(digit);
            number /= 10;
        }
    }
}
