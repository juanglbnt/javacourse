package Exercises;

import java.util.Scanner;

public class TimeTable {

    public static void displayTable(){
        int size;
        Scanner in = new Scanner(System.in);

        System.out.print("enter the size > ");
        size = in.nextInt();

        System.out.printf("%2s%2s","*","|");
        for(int i = 1; i <= size; i++){
            System.out.printf("%4d", i);
        }

        System.out.println();
        String[] divisor = new String[size];
        System.out.printf("%s","--------");

        for(int i = 1; i < divisor.length; i++){
            divisor[i] = "----";
            System.out.printf("%s",divisor[i]);
        }

        System.out.println();
        for(int row = 1; row <= size; row++){
            System.out.printf("%2d%2s",row,"|");
            for(int col = 1; col <= size; col++){
                System.out.printf("%4d",col*row);
            }
            System.out.println(" ");

        }
    }

}
