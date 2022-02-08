package Exercises;

import java.util.Scanner;

public class TestPalindromicPhrase {

    public static void main(String[] args) {
        int forwardIndex = 0;
        int backwardIndex;
        String inStr;
        String finalStr = "";
        int strLenght;
        boolean check = true;
        String itsPalindrome = "";
        Scanner in = new Scanner(System.in);

        System.out.print("enter a string: ");
        inStr = in.nextLine().toLowerCase();
        strLenght = inStr.length();

        for(int i = 0; i <= strLenght-1; i++){

            if(Character.isLetter(inStr.charAt(i))){
                finalStr += inStr.charAt(i);
            }
        }
        backwardIndex = finalStr.length()-1;

        while((forwardIndex < backwardIndex) && check){

            if(finalStr.charAt(forwardIndex) == finalStr.charAt(backwardIndex)){
                check = true;
            }else{
                check = false;
            }
            forwardIndex++;
            backwardIndex--;
        }

        itsPalindrome = (check) ? "it's palindrome" : "it's not a palindrome";
        System.out.println(itsPalindrome);

    }
}
