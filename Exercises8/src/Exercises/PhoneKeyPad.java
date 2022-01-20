package Exercises;

import java.util.Scanner;

public class PhoneKeyPad {

    public static void main(String[] args) {
        String inStr;
        int length;
        char currentChar;
        Scanner in = new Scanner(System.in);

        System.out.print("enter a string > ");
        inStr = in.next().toLowerCase();
        length = inStr.length();

        for(int i = 0; i <= length-1; i++){

            currentChar = inStr.charAt(i);

            switch(currentChar){
                case 'a':
                    System.out.println(2);
                    break;
                case 'b':
                    System.out.println("2-2");
                    break;
                case 'c':
                    System.out.println("2-2-2");
                    break;

                case 'd':
                    System.out.println(3);
                    break;
                case 'e':
                    System.out.println("3-3");
                    break;
                case 'f':
                    System.out.println("3-3-3");
                    break;


                case 'g':
                    System.out.println("4");
                    break;
                case 'h':
                    System.out.println("4-4");
                    break;
                case 'i':
                    System.out.println("4-4-4");
                    break;

                case 'j':
                    System.out.println("5");
                    break;
                case 'k':
                    System.out.println("5-5");
                    break;
                case 'l':
                    System.out.println("5-5-5");
                    break;

                case 'm':
                    System.out.println("6");
                    break;
                case 'n':
                    System.out.println("6-6");
                    break;
                case 'o':
                    System.out.println("6-6-6");
                    break;

                case 'p':
                    System.out.println("7");
                    break;
                case 'q':
                    System.out.println("7-7");
                    break;
                case 'r':
                    System.out.println("7-7-7");
                    break;
                case 's':
                    System.out.println("7-7-7-7");
                    break;

                case 't':
                    System.out.println("8");
                    break;
                case 'u':
                    System.out.println("8-8");
                    break;
                case 'v':
                    System.out.println("8-8-8");
                    break;

                case 'w':
                    System.out.println("9");
                    break;
                case 'x':
                    System.out.println("9-9");
                    break;
                case 'y':
                    System.out.println("9-9-9");
                    break;
                case 'z':
                    System.out.println("9-9-9-9");

                default:
                    System.out.println("only characters please");
                    break;
            }
        }
    }
}
