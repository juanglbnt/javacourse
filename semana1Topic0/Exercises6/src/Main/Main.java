package Main;

import Exercises.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option;


        do{
            System.out.print("\n---------------Exercises 6---------------\n");
            System.out.print("\n0. exit\n1. Square Pattern\n2. Check Pattern\n3. time table" +
                    "\n4. triangular pattern\n5. box patterns\n6. number patterns" +
                    "\n7. hill pattern\n> ");
            option = in.nextInt();

            switch(option){
                case 1:
                    SquarePattern.makeSquare();
                    break;
                case 2:
                    CheckPattern.makePattern();
                    break;
                case 3:
                    TimeTable.displayTable();
                    break;
                case 4:
                    TriangularPattern.printPatterns();
                    break;
                case 5:
                    BoxPattern.printAllPatterns();
                    break;
                case 6:
                    NumberPattern.printAllPatterns();
                    break;
                case 7:
                    HillPattern.printAllPatterns();
                    break;
                default:
                    break;
            }
        }while(option > 0);
        System.out.println("THANK YOU");
    }
}
