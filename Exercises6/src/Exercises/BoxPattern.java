package Exercises;

import java.util.Scanner;

public class BoxPattern {
    static Scanner in = new Scanner(System.in);

    public static int getSize(){
        int size;
        System.out.print("enter the size > ");
        size = in.nextInt();
        return size;
    }

    public static String printPatternA(int size){
        String patternA = "";

        for(int row = 1; row <= size; row++){
            for(int col = 1; col <= size; col++){
                if(row == 1 || row == size || col == 1 || col == size){
                    patternA += " # ";
                }else{
                    patternA += "   ";
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
                if(row == 1 || row == size || row == col){
                    patternB += " # ";
                }else{
                    patternB += "   ";
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
                if(row == 1 || row == size || row + col == size + 1){
                    patternC += " # ";
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
                if(row == 1 || row + col == size + 1
                        || row == col || row == size){
                    patternD += " # ";
                }else{
                    patternD += "   ";
                }
            }
            patternD += "\n";
        }
        return patternD;
    }

    public static String printPatternE(int size){
        String patternE = "";

        for(int row = 1; row <= size; row++){
            for(int col = 1; col <= size; col++){
                if(row == 1 || row == size || row + col == size + 1
                || col == 1 || col == size || row == col){
                    patternE += " # ";
                }else{
                    patternE += "   ";
                }
            }
            patternE += "\n";
        }
        return patternE;
    }

    public static void printAllPatterns(){
        int size = getSize();
        System.out.println(printPatternA(size));
        System.out.println(printPatternB(size));
        System.out.println(printPatternC(size));
        System.out.println(printPatternD(size));
        System.out.println(printPatternE(size));
    }
}
