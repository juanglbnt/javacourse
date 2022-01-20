package Exercises;

import java.util.Scanner;

public class Bin2Dec {

    public static void main(String[] args) {
        String inStr;

        Scanner in = new Scanner(System.in);
        System.out.print("enter a binary number: ");
        inStr = in.next();

        if(isBinary(inStr)){
            binaryToString(inStr);
        }else{
            System.out.print(inStr + " is not binary");
        }
    }

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
}
