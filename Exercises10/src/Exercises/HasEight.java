package Exercises;

import java.util.Scanner;

public class HasEight {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HasEight hasEight = new HasEight();

        hasEight.magicSum();

    }

    public boolean hasEight(int number){
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

    public void magicSum(){
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
