import java.util.Scanner;

public class GradesStatistics {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStudents;
        int[] studentsGrades;
        int grade, sum, minimum, maximum;

        System.out.print("enter the number of students: ");
        numberOfStudents = in.nextInt();
        studentsGrades = new int[numberOfStudents];
        int currentStudent;
        sum = 0;
        double average;

        for(int i = 0; i < studentsGrades.length; i++){
            currentStudent = i + 1;
            System.out.print("enter the grade of student: " + currentStudent + ": ");
            grade = in.nextInt();
            studentsGrades[i] = grade;
        }
        maximum = studentsGrades[0];
        minimum = studentsGrades[0];

        for(int i = 0; i < studentsGrades.length; i++){
            sum += studentsGrades[i];
            if(studentsGrades[i] > maximum){
                maximum = studentsGrades[i];
            }
            if(studentsGrades[i] < minimum){
                minimum = studentsGrades[i];
            }
        }

        average = (double) sum / numberOfStudents;
        System.out.printf("the average is: %.2f", average);
        System.out.printf("%nthe minimum is: %d%nthe maximum is: %d",minimum,maximum);
    }
}
