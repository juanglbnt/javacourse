package Exercises;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        String inStr;
        int Strlenght;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string > ");
        inStr = in.next();
        Strlenght = inStr.length();

        System.out.print("the reverse of -> " + inStr + " <- is: ");
        for(int i = Strlenght-1; i >= 0; i--){
            System.out.print(inStr.charAt(i));
        }

    }
}
