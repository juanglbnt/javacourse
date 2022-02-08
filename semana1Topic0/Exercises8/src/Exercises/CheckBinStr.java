package Exercises;

import java.util.Scanner;

public class CheckBinStr {

    public static void main(String[] args) {
        String inStr;
        int strLength;
        char currentChar;
        boolean isValid;
        Scanner in = new Scanner(System.in);

        System.out.print("enter a binary number: ");
        inStr = in.next();
        strLength = inStr.length();
        isValid = true;

        for(int i = 0; i <= strLength-1; i++){
            currentChar = inStr.charAt(i);
            if(!((currentChar == '1') || (currentChar == '0'))){
                isValid = false;
                break;
            }
        }

        if(isValid){
            System.out.print("\"" + inStr +"\"" + " its a binary string");
        }else{
            System.out.print("\"" + inStr +"\"" + "its NOT a binary string");
        }
    }
}
