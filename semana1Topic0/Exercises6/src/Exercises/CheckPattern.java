package Exercises;

import java.util.Scanner;

public class CheckPattern {

    public static void makePattern(){
        int size;
        boolean check = false;
        Scanner in = new Scanner(System.in);

        System.out.print("enter the size > ");
        size = in.nextInt();

        for(int row = 0; row < size; row++){
            for(int col = 0; col < size; col++){
                //if(row % 2 == 0) {
             //       check = true;
             //   }
                System.out.print(" # ");

            }
            System.out.println();
            if(row % 2 == 0){
                System.out.print(" ");
            }

        }
    }
}
