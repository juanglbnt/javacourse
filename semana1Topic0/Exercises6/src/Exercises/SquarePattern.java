package Exercises;

import java.util.Scanner;

public class SquarePattern {

    public static void makeSquare(){
        int size;
        Scanner in = new Scanner(System.in);

        System.out.print("enter the size > ");
        size = in.nextInt();

        for(int row = 0; row < size; row++){
            for(int col = 0; col < size; col++){
                System.out.print(" # ");
            }
            System.out.println();
        }

    }
}
