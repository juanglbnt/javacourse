package Exercises;

import java.util.Scanner;

public class TriangularPattern {
    static int size;
    static Scanner in = new Scanner(System.in);

    public static int getSize(){
        System.out.print("enter the size > ");
        size = in.nextInt();
        return size;
    }

    public static String printPatternA(int size){
        String patternA = "";

        for(int row = 1; row <= size; row++){
            for(int col = 1; col <= size; col++){
                if(row >= col){
                    patternA += " * ";
                }
            }
            patternA += "\n";
        }

        return patternA;
    }

    public static String printPatternB(int size){
        String patternB = "";

        for(int row = 1; row <= size; row++){
            for(int col = 1; col <= size; col++){
                if(row + col <= size + 1){
                    patternB += " * ";
                }
            }
            patternB += "\n";
        }
        return patternB;
    }

    public static String printPatternC(int size){
        String patternC = "";

        for(int row = 1; row <= size; row++){
            for(int col = 1; col <= size; col++){
                if(row <= col){
                    patternC += " * ";
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

        for(int row = 1; row <= size; row++){
            for(int col = 1; col <= size; col++){
                if(row + col >= size+1){
                    patternD += " * ";
                }else{
                    patternD += "   ";
                }
            }
            patternD += "\n";
        }
        return patternD;
    }

    public static void printPatterns(){
        int size = getSize();
        System.out.println(printPatternA(size));
        System.out.println(printPatternB(size));
        System.out.println(printPatternC(size));
        System.out.println(printPatternD(size));
    }
}
