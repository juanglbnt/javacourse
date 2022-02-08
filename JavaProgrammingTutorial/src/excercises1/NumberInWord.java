package excercises1;

public class NumberInWord {

    public static void printWithSwitch(int[] numbers){

        System.out.println("\n-----------------------\nwith switch-case");
        for(int num: numbers){

            switch (num){
                case 1:
                    System.out.println(num + "-> ONE");
                    break;
                case 2:
                    System.out.println(num + "-> TWO");
                    break;
                case 3:
                    System.out.println(num + "-> THREE");
                    break;
                case 4:
                    System.out.println(num + "-> FOUR");
                    break;
                case 5:
                    System.out.println(num + "-> FIVE");
                    break;
                case 6:
                    System.out.println(num + "-> SIX");
                    break;
                case 7:
                    System.out.println(num + "-> SEVEN");
                    break;
                case 8:
                    System.out.println(num + "-> EIGHT");
                    break;
                case 9:
                    System.out.println(num + "-> NINE");
                    break;
                default:
                    System.out.println(num + "-> OTHER");

            }
        }
    }

    public static void PrintWithNestedIf(int[] numbers){

        System.out.println("with nested if statement");

        for (int num : numbers){
            if (num == 1){
                System.out.println(num + " -> ONE");
            }else if(num == 2){
                System.out.println(num + " -> TWO");
            }else if(num == 3){
                System.out.println(num + " -> THREE");
            }else if(num == 4){
                System.out.println(num + " -> FOUR");
            }else if(num == 5){
                System.out.println(num + " -> FIVE");
            }else if(num == 6){
                System.out.println(num + " -> SIX");
            }else if(num == 7){
                System.out.println(num + " -> SEVEN");
            }else if(num == 8){
                System.out.println(num + " -> EIGHT");
            }else if(num == 9){
                System.out.println(num + " -> NINE");
            }else{
                System.out.println(num + " -> OTHER");
            }
        }
    }

}
