package Exercises;

import java.util.Scanner;

public class RadixNToDec {

    public static void main(String[] args) {
        String inStr;
        Scanner in = new Scanner(System.in);

        System.out.print("insert a number in base (2, 8 or 16): ");
        inStr = in.next();

        if(isBinary(inStr)){
            binaryToString(inStr);
        }else if(isHex(inStr)){
            hexToDec(inStr);
        }else if(isNum(inStr)){
            octalToDecimal(inStr);
        }else{
            System.out.print("INVALID INPUT... try again");
        }

    }

    //calculating
    //binary to dec
    public static void binaryToString(String str){
        int strLength;
        double exponent;
        int decimal;
        int currentDec;

        strLength = str.length();
        exponent = 0;
        decimal = 0;

        for(int i = strLength-1; i >= 0; i--){
            currentDec = (int) Math.pow(2, exponent);
            exponent++;

            if(str.charAt(i) == '1'){
                decimal += currentDec;
            }
        }
        System.out.println("the decimal is: " + decimal);
    }

    //hexadecimal to dec
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

    //octal to decimal
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



    //check inputs

    //is binary?
    public static boolean isBinary(String str){

        String inStr;
        int strLength;
        char currentChar;
        boolean isValid;
        isValid = true;
        strLength = str.length();
        for(int i = 0; i <= strLength-1; i++){
            currentChar = str.charAt(i);
            if(!((currentChar == '1') || (currentChar == '0'))){
                isValid = false;
                break;
            }
        }
        return isValid;
    }

    //is octal?
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

    //or hexadecimal
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
