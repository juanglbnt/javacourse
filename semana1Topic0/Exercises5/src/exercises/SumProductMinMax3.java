package exercises;

import java.util.Scanner;

public class SumProductMinMax3 {

    public static void compute(){
        int number1;
        int number2;
        int number3;
        int sum;
        int product;
        int min;
        int max;

        System.out.println("----THREE PRODUCTS MIN MAX----");
        Scanner scan = new Scanner(System.in);
        System.out.print("number 1: ");
        number1 = scan.nextInt();
        System.out.print("number 2: ");
        number2 = scan.nextInt();
        System.out.print("number 3: ");
        number3 = scan.nextInt();

        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;

        min = number1;
        if(number2 < min){
            min = number2;
        }
        if(number3 < min){
            min = number3;
        }

        max = number1;
        if(number2 > number1){
            max = number2;
        }
        if(number3 > max){
            max = number3;
        }

        System.out.println("the sum is: " + sum + "\nthe product is: " + product);
        System.out.println("the max is: " + max + "\nthe min is: " + min);

    }

}
