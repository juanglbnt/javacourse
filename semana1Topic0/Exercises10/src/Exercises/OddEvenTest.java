package Exercises;

import java.util.Scanner;

public class OddEvenTest {

    public static void validate(){
        int input;
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number: ");
        input = in.nextInt();

        if(OddEvenTest.isOdd(input)){
            System.out.print("IT'S EVEN");
        }else{
            System.out.print("IT'S ODD");
        }
    }

    public static boolean isOdd(int input){
        if(input % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
