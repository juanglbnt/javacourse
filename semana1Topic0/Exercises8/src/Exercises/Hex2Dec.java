package Exercises;

import java.util.Scanner;

public class Hex2Dec {

    public static void main(String[] args) {
        String inStr;
        Scanner in = new Scanner(System.in);
        System.out.print("enter a hexadecimal number: ");
        inStr = in.next();

        if(isHex(inStr)){
            hexToDec(inStr);
        }else{
            System.out.print(inStr + " is NOT a hexadecimal number");
        }

    }

    public static void hexToDec(String str){
        double exponent;
        int strLength;
        int decimal;
        int currentDec;
        int currentNum;
        char currentChar;
        final double BASE = 16;

        exponent = 0;
        decimal = 0;
        strLength = str.length();
        for(int i = strLength-1; i >= 0; i--){
            currentChar = str.charAt(i);

            //for a - f numbers
            switch(currentChar){
                case 'a':
                    currentNum = 10;
                    break;
                case 'b':
                    currentNum = 11;
                    break;
                case 'c':
                    currentNum = 12;
                    break;
                case 'd':
                    currentNum = 13;
                    break;
                case 'e':
                    currentNum = 14;
                    break;
                case 'f':
                    currentNum = 15;
                    break;
                default:
                    currentNum = Character.getNumericValue(str.charAt(i));
                    break;

            }

            currentDec = currentNum * ( (int) Math.pow(BASE, exponent) );
            exponent++;
            decimal += currentDec;
        }
        System.out.print("the decimal is: " + decimal);
    }


    public static boolean isHex(String str){
        int strLength;
        char currentChar;
        boolean isValid;
        isValid = true;
        strLength = str.length();

        for(int i = 0; i <= strLength-1; i++){
            currentChar = str.charAt(i);
            if(!( (currentChar >= '0' && currentChar <= '9') ||
                    (currentChar >= 'a' && currentChar <= 'f'))){
                isValid = false;
                break;
            }
        }
        return isValid;
    }
}
