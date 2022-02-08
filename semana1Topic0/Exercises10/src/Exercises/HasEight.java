package Exercises;

import java.util.Scanner;

public class HasEight {

    public static boolean hasEight(int number){
        String num = "";
        int length;
        boolean isValid = false;

        num = number+"";
        length = num.length();

        for(int i = 0; i < length; i++){
            if(num.charAt(i) == '8'){
                isValid = true;
            }
        }

        return isValid;
    }

    public static void magicSum(){
        Scanner in = new Scanner(System.in);
        int number = 0;
        int magicSum = 0;

        do{
            System.out.print("enter a positive integer: ");
            number = in.nextInt();

            if(hasEight(number)){
                magicSum += number;
            }
        }while(number != -1);

        System.out.print("the magic sum is: " + magicSum);
    }


}
