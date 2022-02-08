package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class CountVowelsDigits {

    public static void main(String[] args) {
        String inStr;
        int strLength = 0;
        int vowelsNumber = 0;
        int digitsNumber = 0;
        double vowelsPercent = 0.0;
        double digitsPercent = 0.0;
        Scanner in = new Scanner(System.in);

        System.out.print("enter a string > ");
        inStr = in.next().toLowerCase();
        strLength = inStr.length();

        for(int i = 0; i <= strLength-1; i++){

            if(Character.isDigit(inStr.charAt(i))){
                digitsNumber++;
            }

            char actualChar = inStr.charAt(i);
            if(actualChar == 'a' || actualChar == 'e' || actualChar == 'i' ||
               actualChar == 'o' || actualChar == 'u'){
                vowelsNumber++;
            }
        }

        vowelsPercent = ((double) vowelsNumber / strLength) * 100;
        digitsPercent = ((double)digitsNumber / strLength) * 100;

        System.out.printf("number of vowels: %d (%.2f%%)", vowelsNumber,vowelsPercent);
        System.out.printf("\nnumber of digits: %d (%.2f%%)", digitsNumber,digitsPercent);
    }
}
