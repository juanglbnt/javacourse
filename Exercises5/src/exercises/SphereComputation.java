package exercises;

import java.util.Scanner;

public class SphereComputation {

    public static void calculate(){
        double radius = 0.0;
        System.out.println("\n-----SPHERE VOLUME AND SURFACE-------");
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the radius: ");
        radius = scan.nextDouble();


        double PI = Math.PI;
        double surfaceArea = 4 * PI * (radius * radius);
        double volume = (4/3) * PI * (radius * radius * radius);

        System.out.printf("surface area: %.2f%nvolume: %.2f", surfaceArea, volume);
    }
}
