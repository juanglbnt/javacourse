package Exercises;

import java.util.Scanner;

public class Oct2Dec {

    public static void main(String[] args) {
        String inStr;
        Scanner in = new Scanner(System.in);

        System.out.print("enter the octal number: ");
        inStr = in.next();

        if(isNum(inStr)){
            octalToDecimal(inStr);
        }else{
            System.out.print("INVALID NUMBER");
        }
    }

    public static void octalToDecimal(String str){
        double exponent;
        int strLength;
        int decimal;
        int currentDec;
        int currentNum;
        final double BASE = 8;

        strLength = str.length();
        decimal = 0;
        exponent = 0;
        currentDec = 0;

        for(int i = strLength-1; i>= 0; i--){
            currentNum = Character.getNumericValue(str.charAt(i));
            currentDec = currentNum * ((int) Math.pow(BASE, exponent));
            decimal += currentDec;
            exponent++;
        }

        System.out.print("the decimal is: " + decimal);

    }

    public static boolean isNum(String str){
        int strLength;
        boolean isValid;

        strLength = str.length();
        isValid = true;

        for(int i = 0; i <= strLength-1; i++){
            if(! (Character.isDigit(str.charAt(i))) ){
                isValid = false;
                break;
            }
        }

        return isValid;
    }

}
