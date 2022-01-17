package exercises;

import java.util.Scanner;

public class IncomeTaxCalculator {

    public static void taxable(){
        int income;
        double tax = 0.0;
        final double TAX_RATE_ABOVE_20 = 0.1;
        final double TAX_RATE_ABOVE_40 = 0.2;
        final double TAX_RATE_ABOVE_60 = 0.3;
        final double PERCENT_REBATE = 0.1;
        final int LIMIT = 1000;
        int rest;
        double finalTax = 0.0;
        double rebate = 0.0;
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter the income taxable: ");
        income = scan.nextInt();

        if(income <= 20000){
            tax = 20000 * 0.0;
        }else if(income <= 40000){
            rest = income - 20000;
            tax = rest * TAX_RATE_ABOVE_20;
        }else if(income <= 60000){
            rest = income - 40000;
            tax = 20000 * TAX_RATE_ABOVE_20 + rest * TAX_RATE_ABOVE_40;
        }else{
            rest = income - 60000;
            tax = 20000 * TAX_RATE_ABOVE_20 + 20000 * TAX_RATE_ABOVE_40 + rest * TAX_RATE_ABOVE_60;
        }

        rebate = tax * PERCENT_REBATE;
        if(rebate > LIMIT){
            rebate = LIMIT;
        }

        finalTax = tax - rebate;
        System.out.printf("income tax payable: %.2f%nrebate of: %.2f%nfinal tax payable: %.2f", tax, rebate, finalTax);
    }
}
