package Main;

import Exercises.CheckPattern;
import Exercises.SquarePattern;
import Exercises.TimeTable;
import Exercises.TriangularPattern;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option;
        do{
            System.out.print("\n---------------Exercises 6---------------\n");
            System.out.println("\n0. exit\n1. Square Pattern\n2. Check Pattern\n3. time table\n4. triangular pattern");
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
                    TriangularPattern.printAll();
                    break;
                default:
                    break;
            }
        }while(option > 0);
    }
}
