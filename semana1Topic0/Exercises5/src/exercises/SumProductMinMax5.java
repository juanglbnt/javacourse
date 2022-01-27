package exercises;

import java.util.Scanner;

public class SumProductMinMax5 {


    public static void compute(){
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int sum;
        int product;
        int min;
        int max;

        System.out.println("----FIVE PRODUCTS MIN MAX----");
        Scanner scan = new Scanner(System.in);
        System.out.print("number 1: ");
        number1 = scan.nextInt();
        System.out.print("number 2: ");
        number2 = scan.nextInt();
        System.out.print("number 3: ");
        number3 = scan.nextInt();
        System.out.print("number 4: ");
        number4 = scan.nextInt();
        System.out.print("number 5: ");
        number5 = scan.nextInt();

        sum = number1 + number2 + number3 + number4 + number5;
        product = number1 * number2 * number3 * number4 * number5;

        //calculate the min
        min = number1;
        if(number2 < min){
            min = number2;
        }
        if(number3 < min){
            min = number3;
        }
        if(number4 < min){
            min = number4;
        }
        if(number5 < min){
            min = number5;
        }

        //calculate the max
        max = number1;
        if(number2 > max){
            max = number2;
        }
        if(number3 > max){
            max = number3;
        }
        if(number4 > max){
            max = number4;
        }
        if(number5 > max){
            max = number5;
        }

        System.out.println("the sum is: " + sum + "\nthe product is: " + product +
                "\nmin: " + min + "\nmax: " + max);
    }
}
