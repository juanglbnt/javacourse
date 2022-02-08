package exercises;

import java.util.Scanner;

public class SalesTaxCalculator {

    public static void taxSales(){
        final double SALES_TAX_RATE = 0.07;
        final int SENTINEL = -1;
        double price, actualPrice, salesTax;
        double totalPrice = 0.0, totalActualPrice = 0.0, totalSalesTax = 0.0;
        Scanner scan = new Scanner(System.in);

        System.out.print("enter the tax-inclusive price (or -1 to end) > ");
        price = scan.nextDouble();

        while(price != SENTINEL){

            actualPrice = price / 1.07;
            salesTax = actualPrice * SALES_TAX_RATE;
            totalPrice += price;
            totalActualPrice += actualPrice;
            totalSalesTax += salesTax;
            System.out.printf("actual price is: %.2f, sales tax is: %.2f%n%n", actualPrice, salesTax);
            System.out.print("enter the tax-inclusive price (or -1 to end) > ");
            price = scan.nextDouble();
        }
        System.out.printf("total price is: %.2f%ntotal actual price is: %.2f%ntotal tax is: %.2f%n", totalPrice, totalActualPrice, totalSalesTax);

    }
}
