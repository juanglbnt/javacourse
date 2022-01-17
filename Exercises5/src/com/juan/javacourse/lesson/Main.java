package com.juan.javacourse.lesson;

import exercises.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //Add2Integer.sum();
        //SumProductMinMax3.compute();
        //SumProductMinMax5.compute();
        //CircleComputation.calculate();
        //SphereComputation.calculate();
        //CylinderComputation.calculate();
        //Swap2Integers.swap();
        //IncomeTaxCalculator.taxable();
        //IncomeTaxCalculatorWithSentinel.taxable();
        //PensionContribution.calculatePension();

        Scanner scan = new Scanner(System.in);
        int option = 0;

        do{
            System.out.println("\n----------------------------------\n0. exit\n1. Sum product min max\n2. circle computation\n3. sphere computation\n4. cylinder computation" +
                    "\n5. swap two integers\n6. income tax calculator\n7. pension contribution calculator\n8. sales tax calculator \n");
            option = scan.nextInt();

            switch(option){
                case 1:
                    SumProductMinMax5.compute();
                    break;
                case 2:
                    CircleComputation.calculate();
                    break;
                case 3:
                    SphereComputation.calculate();
                    break;
                case 4:
                    CylinderComputation.calculate();
                    break;
                case 5:
                    Swap2Integers.swap();
                    break;
                case 6:
                    IncomeTaxCalculatorWithSentinel.taxable();
                    break;
                case 7:
                    PensionContributionSentinel.calculate();
                    break;
                case 8:
                    SalesTaxCalculator.taxSales();
                    break;
                default:
                    break;
            }

        }while(option !=0);

    }
}
