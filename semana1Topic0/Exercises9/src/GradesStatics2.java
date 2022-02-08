import java.util.ArrayList;
import java.util.Scanner;

public class GradesStatics2 {

    ArrayList<Integer> grades = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        GradesStatics2 grades = new GradesStatics2();
        grades.computeGrades(grades.getGrades());
    }

    public ArrayList<Integer> getGrades(){
        String grade;
        int student = 1;

        do{
            System.out.print("enter the grade of the student "+student+" (or enter to exit): ");
            grade = scan.nextLine();
            try{
                grades.add(Integer.parseInt(grade));
                student++;
            }catch (NumberFormatException e){
                if(grade.equalsIgnoreCase("")){
                    break;
                }else{
                    System.out.println("enter only a number (o just type ENTER to exit)");
                }
            }

        }while (!(grade.equalsIgnoreCase("")));

        return grades;
    }

    public void computeGrades(ArrayList<Integer> grades){
        int sum = 0;
        double average;
        int minimum = grades.get(0);
        int maximum = grades.get(0);

        for(int i = 0; i < grades.size(); i++){
            sum += grades.get(i);

            if(maximum < grades.get(i)){
                maximum = grades.get(i);
            }
            if(minimum > grades.get(i)){
                minimum = grades.get(i);
            }
        }

        average = (double) sum / grades.size();
        System.out.printf("%nthe average is: %.2f", average);
        System.out.printf("%nthe minimum grade was: %d%n" +
                "the maximum grade was: %d",minimum,maximum);

    }
}
