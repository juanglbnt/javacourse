package excercises1;

public class PrintDayInWord {

    public PrintDayInWord(){

    }

    public void DayInWordIf(int[] days){
        System.out.println("\n-----------------------\ndays with nested-if statement");

        for(int day : days){
            if(day == 1){
                System.out.println("MONDAY");
            }else if(day == 2){
                System.out.println("TUESDAY");
            }else if(day == 3){
                System.out.println("WEDNESDAY");
            }else if(day == 4){
                System.out.println("THURSDAY");
            }else if(day == 5){
                System.out.println("FRIDAY");
            }else if(day == 6){
                System.out.println("SATURDAY");
            }else if(day == 7){
                System.out.println("SUNDAY");
            }else{
                System.out.println("not a valid day");
            }
        }
    }

    public void dayInWordSwitch(int[] days){
        System.out.println("\n-------------------------\ndays with switch-case");

        for (int day : days){

            switch (day){
                case 1:
                    System.out.println("MONDAY");
                    break;
                case 2:
                    System.out.println("TUESDAY");
                    break;
                case 3:
                    System.out.println("WEDNESDAY");
                    break;
                case 4:
                    System.out.println("THURSDAY");
                    break;
                case 5:
                    System.out.println("FRIDAY");
                    break;
                case 6:
                    System.out.println("SATURDAY");
                    break;
                case 7:
                    System.out.println("SUNDAY");
                    break;
                default:
                    System.out.println("not a valid day");
            }
        }
    }
}
