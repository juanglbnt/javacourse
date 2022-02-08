package Exercises;

import java.util.Scanner;

public class CaesarsCode {

    public static void main(String[] args) {

        String inStr;
        int strLenght = 0;
        char currentChar;
        char newChar;
        int numberNewChar;
        final int NUMBER_ENCRYPTION = 3;
        Scanner in = new Scanner(System.in);
        System.out.print("enter a string to encrypt: ");
        inStr = in.next().toLowerCase();
        strLenght = inStr.length();
        System.out.print("the criphertext string is: ");

        for(int i = 0; i <= strLenght-1; i++) {

            currentChar = inStr.charAt(i);

            //for x, y and z
            if(currentChar == 'x'){
                numberNewChar = 97;
            }else if(currentChar == 'y') {
                numberNewChar = 98;
            }else if(currentChar == 'z'){
                numberNewChar = 99;
            }else{
                numberNewChar = currentChar + NUMBER_ENCRYPTION;
            }

            newChar = (char) numberNewChar;
            System.out.print(newChar);

        }
    }
}
