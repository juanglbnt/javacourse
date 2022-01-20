import java.util.Scanner;

public class PrintArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int itemsNumber;
        int[] items;
        int number;
        System.out.print("enter the number of items: ");
        itemsNumber = in.nextInt();
        items = new int[itemsNumber];

        if(itemsNumber > 0){
            System.out.print("enter the numbers (separated by space): ");
            for(int i = 0; i< itemsNumber; i++){
                items[i] = in.nextInt();
            }
        }

        System.out.print("the items are: [");

        for(int i = 0; i < items.length; i++){
            System.out.print(items[i]);
            if(i < items.length-1){
                System.out.print(", ");
            }
        }

        System.out.print("]");
    }
}
