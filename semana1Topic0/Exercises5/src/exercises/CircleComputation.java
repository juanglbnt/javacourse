package exercises;

import java.util.Scanner;

public class CircleComputation {

    public static void calculate(){
        double radius;
        double diameter;
        double circumference;
        double area;
        double PI = Math.PI;

        System.out.println("----CIRCLE COMPUTATION------");
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the radius: ");
        radius = scan.nextDouble();

        diameter = 2.0 * radius;
        area = PI * (radius * radius);
        circumference = 2.0 * PI * radius;
        System.out.printf("the diameter is: %.2f%n" +
                "the area is: %.2f%n" +
                "the circumference is: %.2f", diameter, area, circumference);
    }
}
