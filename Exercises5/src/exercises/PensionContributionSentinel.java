package exercises;

import java.util.Scanner;

public class PensionContributionSentinel {

    public static void calculate(){
        final int SENTINEL = -1;
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_BELOW = 0.2;
        final double EMPLOYER_RATE_55_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;
        int salary, age;
        int contributeSalary;
        double employeeContribution, employerContribution, totalContribution;
        Scanner scan = new Scanner(System.in);

        System.out.print("enter the monthly salary (or -1 to end): $");
        salary = scan.nextInt();

        while(salary != SENTINEL){

            if(salary > SALARY_CEILING){
                contributeSalary = SALARY_CEILING;
            }else{
                contributeSalary = salary;
            }

            System.out.print("enter the age: ");
            age = scan.nextInt();

            if(age <= 55){
                employeeContribution = contributeSalary * EMPLOYEE_RATE_55_BELOW;
                employerContribution = contributeSalary * EMPLOYER_RATE_55_BELOW;
            }else if(age <= 60){
                employeeContribution = contributeSalary * EMPLOYEE_RATE_55_TO_60;
                employerContribution = contributeSalary * EMPLOYER_RATE_55_TO_60;
            }else if(age <= 65){
                employeeContribution = contributeSalary * EMPLOYEE_RATE_60_TO_65;
                employerContribution = contributeSalary * EMPLOYER_RATE_60_TO_65;
            }else{
                employeeContribution = contributeSalary * EMPLOYEE_RATE_65_ABOVE;
                employerContribution = contributeSalary * EMPLOYER_RATE_65_ABOVE;
            }
            totalContribution = employeeContribution + employerContribution;

            System.out.printf("the employee's contribution: %.2f%n", employeeContribution);
            System.out.printf("the employer's contribution: %.2f%n", employerContribution);
            System.out.printf("the total contribution: %.2f%n", totalContribution);

            System.out.print("enter the monthly salary (or -1 to end): $");
            salary = scan.nextInt();
        }

    }
}
