package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class GradeStatistics {
    Scanner in = new Scanner(System.in);
    int numberOfStudents;
    int media, minimum, maximum, sum;
    int[] grades;
    double average;
    double deviation;

    public GradeStatistics(){

    }

    public int[] getData(){
        System.out.print("enter the number of students: ");
        numberOfStudents = in.nextInt();
        grades = new int[numberOfStudents];
        String number = "";
        int num = 0;

        for(int i = 0; i < grades.length; i++){

            do{
                System.out.print("enter the grade of student " +
                        ((int) i + 1) + ": ");
                number = in.next();

                if(!(validate(number))){
                    System.out.print("PLEASE ONLY ENTER A NUMBER (0 - 100)\n");
                }else{
                    num = Integer.parseInt(number);
                }
            }while(!(validate(number)));

            grades[i] = num;
        }
        return grades;
    }

    public boolean isNum(String num){
        try{
            Integer.parseInt(num);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public boolean validate(String num){
        if(isNum(num) && Integer.parseInt(num) > 0 && Integer.parseInt(num) <= 100){
            return true;
        }else{
            return false;
        }
    }

    public String showData(int[] grades){
        String data = "";

        data += "grades [";
        for(int i = 0; i < grades.length; i++){

            data += grades[i]+"";

            if(i < (grades.length-1)){
                data += ", ";
            }
        }

        data += "]";
        return data;
    }

    public void computeValues(){
        System.out.println(showData(getData()));

        for(int i = 0; i < grades.length; i++){
            sum += grades[i];
        }
        average = (double) sum / grades.length;
        System.out.printf("the average is: %.2f", average);
        getMedian();
        getMinMax();
        getDeviation();
    }

    public void getMedian(){
        int arrayOrd[];
        arrayOrd = Arrays.copyOf(grades, grades.length);
        int median, half;
        int arraySize = arrayOrd.length;
        Arrays.sort(arrayOrd);
        half = arraySize / 2;

        if(arraySize % 2 == 0){
            median = (arrayOrd[half - 1] + arrayOrd[half]) / 2;
        }else{
            median = arrayOrd[half];
        }

        System.out.printf("\nthe median is: %d", median);
    }

    public void getMinMax(){
        minimum = grades[0];
        maximum = grades[0];

        for(int i = 0; i < grades.length; i++){

            if(minimum > grades[i]){
                minimum = grades[i];
            }
            if(maximum < grades[i]){
                maximum = grades[i];
            }
        }

        System.out.printf("%nthe minimum was: %d%nthe maximum was: %d",minimum, maximum);
    }

    public void getDeviation(){
        double[] distances = new double[grades.length];
        double distance;
        double sumDistances = 0;
        double division = 0.0;

        for(int i = 0; i < grades.length; i++){

            if(grades[i] > average){
                distance = grades[i] - average;
            }else{
                distance = average - grades[i];
            }

            distances[i] = Math.pow(distance, 2);
        }

        for(int i = 0; i < distances.length; i++){
            sumDistances += distances[i];
        }

        division = sumDistances / grades.length;
        deviation = Math.sqrt(division);

        System.out.printf("%nthe deviation is: %.2f", deviation);
        System.out.println("\nhistogram\n");
        makeHistogram(grades);
    }

    public void makeHistogram(int[] grades){

        int starsFor0 = 0;
        int starsFor1 = 0;
        int starsFor2 = 0;
        int starsFor3 = 0;
        int starsFor4 = 0;
        int starsFor5 = 0;
        int starsFor6 = 0;
        int starsFor7 = 0;
        int starsFor8 = 0;
        int starsFor9 = 0;

        for(int i = 0; i < grades.length; i++){

            if(grades[i] >= 0 && grades[i] < 10){
                starsFor0++;
            }else if(grades[i] >= 10 && grades[i] < 20){
                starsFor1++;
            }else if(grades[i] >= 20 && grades[i] < 30){
                starsFor2++;
            }else if(grades[i] >= 30 && grades[i] < 40){
                starsFor3++;
            }else if(grades[i] >= 40 && grades[i] < 50){
                starsFor4++;
            }else if(grades[i] >= 50 && grades[i] < 60){
                starsFor5++;
            }else if(grades[i] >= 60 && grades[i] < 70){
                starsFor6++;
            }else if(grades[i] >= 70 && grades[i] < 80){
                starsFor7++;
            }else if(grades[i] >= 80 && grades[i] < 90){
                starsFor8++;
            }else if(grades[i] >= 90 && grades[i] <= 100){
                starsFor9++;
            }
        }

        System.out.print("0 - 9:    " + getStars(starsFor0) + "\n10 - 19:  " + getStars(starsFor1) +
                "\n20 - 29:  " + getStars(starsFor2) + "\n30 - 39:  " + getStars(starsFor3)
                + "\n40 - 49:  " + getStars(starsFor4) + "\n50 - 59:  " + getStars(starsFor5) +
                "\n60 - 69:  " + getStars(starsFor6) + "\n70 - 79:  " + getStars(starsFor7) +
                "\n80 - 89:  " + getStars(starsFor8) + "\n90 - 100: " + getStars(starsFor9));
    }

    public String getStars(int starsFor){
        String stars = "";

        for(int i = 0; i < starsFor; i++){
            stars += "*";
        }

        return stars;
    }

}
