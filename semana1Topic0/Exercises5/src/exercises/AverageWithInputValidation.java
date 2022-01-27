package exercises;

import java.util.Scanner;

public class AverageWithInputValidation {

    public static void calculateAverage(){
        final int NUM_STUDENTS = 3;
        int markIn;
        boolean isValid = false;
        int sum = 0;
        double average = 0.0;
        Scanner in = new Scanner(System.in);

        for(int student = 1; student <= NUM_STUDENTS; student++){
            System.out.print("enter the mark for the student " + student + " (between 0-100): ");
            markIn = in.nextInt();

            do{
                if(markIn < 0 || markIn > 100){
                    isValid = false;
                    System.out.print("try again...\n");
                    System.out.print("enter the mark for the student " + student + " (between 0-100): ");
                    markIn = in.nextInt();
                }else{
                    isValid = true;
                }
            }while(!isValid);

            sum += markIn;
            average = (double) sum / 3;
        }

        System.out.printf("the average is: %.2f", average);
    }
}
