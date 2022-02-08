package Exercises;

import java.util.Scanner;

public class ExchangeCipher {

    public static void main(String[] args) {
        String inStr;
        int strLenght = 0;
        char currentChar;
        char newChar = '.';
        Scanner in = new Scanner(System.in);
        System.out.print("enter a plaintext string: ");
        inStr = in.next().toLowerCase();
        strLenght = inStr.length();
        System.out.print("the criphertext is: ");

        for(int i = 0; i < strLenght; i++){
            currentChar = inStr.charAt(i);
            switch(currentChar){
                case 'a':
                    newChar = 'z';
                    break;
                case 'b':
                    newChar = 'y';
                    break;
                case 'c':
                    newChar = 'x';
                    break;
                case 'd':
                    newChar = 'w';
                    break;
                case 'e':
                    newChar = 'v';
                    break;
                case 'f':
                    newChar = 'u';
                    break;
                case 'g':
                    newChar = 't';
                    break;
                case 'h':
                    newChar = 's';
                    break;
                case 'i':
                    newChar = 'r';
                    break;
                case 'j':
                    newChar = 'q';
                    break;
                case 'k':
                    newChar = 'p';
                    break;
                case 'l':
                    newChar = 'o';
                    break;
                case 'm':
                    newChar = 'n';
                    break;

                    //ouch
                case 'z':
                    newChar = 'a';
                    break;
                case 'y':
                    newChar = 'b';
                    break;
                case 'x':
                    newChar = 'c';
                    break;
                case 'w':
                    newChar = 'd';
                    break;
                case 'v':
                    newChar = 'e';
                    break;
                case 'u':
                    newChar = 'f';
                    break;
                case 't':
                    newChar = 'g';
                    break;
                case 's':
                    newChar = 'h';
                    break;
                case 'r':
                    newChar = 'i';
                    break;
                case 'q':
                    newChar = 'j';
                    break;
                case 'p':
                    newChar = 'k';
                    break;
                case 'o':
                    newChar = 'l';
                    break;
                case 'n':
                    newChar = 'm';
                    break;

                default:
                    break;

            }
            System.out.print(newChar);
        }


    }
}
