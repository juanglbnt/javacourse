package excercises;

public class CozaLozaWoza {

    static final int LOWERBOUND = 1;
    static final int UPPERBOUND = 110;

    public static void Print(){

        for(int i = LOWERBOUND; i <= UPPERBOUND; i++){

            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("cozaloza");
            }else if((i % 3 == 0) && (i % 7 == 0)){
                System.out.print("cozawoza");
            }else if((i % 5 == 0) && (i % 7 == 0)){
                System.out.print("lozawoza");
            }else if(i % 3 == 0){
                System.out.print("coza");
            }else if(i % 5 == 0){
                System.out.print("loza");
            }else if(i % 7 == 0){
                System.out.print("woza");
            }else{
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }
}
