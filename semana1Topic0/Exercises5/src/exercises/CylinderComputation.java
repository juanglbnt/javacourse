package exercises;

import java.util.Scanner;

public class CylinderComputation {

    public static void calculate(){
        double PI = Math.PI;
        double radius;
        double height;
        double surfaceArea;
        double baseArea;
        double volume;

        System.out.println("\n-------CYLINDER BASE, SURFACE AREA AND VOLUME-------");
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the radius: ");
        radius = scan.nextDouble();
        System.out.print("enter the height: ");
        height = scan.nextDouble();

        baseArea = PI * (radius * radius);
        surfaceArea = 2.0 * PI * radius + 2.0 * baseArea;
        volume = baseArea * height;

        System.out.printf("base area: %.2f%nsurface area: %.2f%nvolume: %.2f",
                baseArea, surfaceArea, volume);
    }
}
