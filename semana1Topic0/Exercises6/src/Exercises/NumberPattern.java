package Exercises;

import java.util.Scanner;

public class NumberPattern {
    static Scanner in = new Scanner(System.in);
    static int size;

    public static int getSize(){
        System.out.print("enter the size > ");
        size = in.nextInt();
        return size;
    }

    public static String printPatternA(int size){
        String patternA = "";
        int number;

        for(int row = 1; row <= size; row++){

            number = 1;

            for(int col = 1; col <= size; col++){
                if(row >= col){
                    patternA += " " + number + " ";
                    number++;
                }
            }
            patternA += "\n";
        }

        return patternA;
    }

    public static String printPatternB(int size){
        String patternB = "";
        int number;

        for(int row = 1; row <= size; row++){

            number = 1;

            for(int col = 1; col <= size; col++){
                if(row + col <= size + 1){
                    patternB += " " + number + " ";
                    number++;
                }
            }
            patternB += "\n";
        }
        return patternB;
    }

    public static String printPatternC(int size){
        String patternC = "";
        int number;

        for(int row = 1; row <= size; row++){

            number = 1;

            for(int col = 1; col <= size; col++){
                if(row <= col){
                    patternC += " " + number + " ";
                    number++;
                }else{
                    patternC += "   ";
                }
            }
            patternC += "\n";

        }
        return patternC;
    }

    public static String printPatternD(int size){
        String patternD = "";
        int number;

        for(int row = 1; row <= size; row++){

            number = 1;

            for(int col = 1; col <= size; col++){
                if(row + col >= size+1){
                    patternD += " " + number + " ";
                    number++;
                }else{
                    patternD += "   ";
                }
            }
            patternD += "\n";
        }
        return patternD;
    }

    public static void printAllPatterns(){
        int size = getSize();
        System.out.println(printPatternA(size));
        System.out.println(printPatternB(size));
        System.out.println(printPatternC(size));
        System.out.println(printPatternD(size));
    }
}
