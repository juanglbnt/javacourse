package Exercises;

import java.util.Scanner;

public class DecipherCaesarCode {

    public static void main(String[] args) {
        String inStr;
        int strLenght = 0;
        char currentChar;
        char newChar;
        int numberNewChar;
        final int NUMBER_ENCRYPTION = 3;
        Scanner in = new Scanner(System.in);
        System.out.print("enter a ciphertext string: ");
        inStr = in.next().toLowerCase();
        strLenght = inStr.length();
        System.out.print("the text is: ");

        for(int i = 0; i <= strLenght-1; i++) {

            currentChar = inStr.charAt(i);

            //for b, b and c
            if(currentChar == 'a'){
                numberNewChar = 120;
            }else if(currentChar == 'b') {
                numberNewChar = 121;
            }else if(currentChar == 'c'){
                numberNewChar = 122;
            }else{
                numberNewChar = currentChar - NUMBER_ENCRYPTION;
            }

            newChar = (char) numberNewChar;
            System.out.print(newChar);

        }
    }
}
