import java.util.Scanner;

public class PrintArrayInStars {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfItems;
        int[] items;

        System.out.print("enter the number of items: ");
        numberOfItems = in.nextInt();
        items = new int[numberOfItems];

        if(numberOfItems > 0){

            System.out.print("enter the numbers (separated by space): ");
            for(int i = 0; i < items.length; i++){
                items[i] = in.nextInt();
            }

            for(int i = 0; i < items.length; i++){
                System.out.print(i + ": ");
                for(int star = 1; star <= items[i]; star++){
                    System.out.print("*");

                }
                System.out.print(" (" + items[i] + ")");
                System.out.println();
            }

        }
    }
}
