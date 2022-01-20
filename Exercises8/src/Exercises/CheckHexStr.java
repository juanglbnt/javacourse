package Exercises;

import java.util.Scanner;

public class CheckHexStr {

    public static void main(String[] args) {
        String inStr;
        int strLength;
        char currentChar;
        boolean isValid;
        Scanner in = new Scanner(System.in);

        System.out.print("enter a hexadecimal number: ");
        inStr = in.next().toLowerCase();
        strLength = inStr.length();
        isValid = true;

        for(int i = 0; i <= strLength-1; i++){
            currentChar = inStr.charAt(i);
            if(!( (currentChar >= '0' && currentChar <= '9') ||
                    (currentChar >= 'a' && currentChar <= 'f'))){
                isValid = false;
                break;
            }
        }

        if(isValid){
            System.out.print("\"" + inStr +"\"" + " its a hex number");
        }else{
            System.out.print("\"" + inStr +"\"" + "its NOT a hex number");
        }
    }
}
