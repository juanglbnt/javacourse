package excercises;

public class CozaLozaWoza {

    static final int LOWERBOUND = 1;
    static final int UPPERBOUND = 110;

    public static void Print(){

        System.out.println("\n------------------------------\n***coozalozawoza***");

        for(int i = LOWERBOUND; i <= UPPERBOUND; i++){

            if((i % 3 == 0) && (i % 5 == 0) && (i % 7 == 0)){
                System.out.println("cozalozawoza");
            }else if((i % 3 == 0) && (i % 5 == 0)){
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

            /*
            * nota:
            * no puedo imprimir como quiero, pues parece que la
            * consola le da cierto formato por defecto */
            if(i % 5 == 0){
                System.out.printf("\n");
            }else{
                System.out.printf(" ");
            }
        }
    }

    public static void print2(){
        boolean printed;
        System.out.println("\n----------------------------\n***cozalozawoza 2***");

        for(int i = LOWERBOUND; i <= UPPERBOUND; i++){

            printed = false;
            if((i % 3 == 0) && (i % 5 == 0) && (i % 7 == 0)){
                System.out.println("cozalozawoza");
                printed = true;
            }else if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("cozaloza");
                printed = true;
            }else if((i % 3 == 0) && (i % 7 == 0)){
                System.out.print("cozawoza");
                printed = true;
            }else if((i % 5 == 0) && (i % 7 == 0)){
                System.out.print("lozawoza");
                printed = true;
            }else if(i % 3 == 0){
                System.out.print("coza");
                printed = true;
            }else if(i % 5 == 0){
                System.out.print("loza");
                printed = true;
            }else if(i % 7 == 0){
                System.out.print("woza");
                printed = true;
            }

            if(!printed){
                System.out.print(i);
            }

            if(i % 5 == 0){
                System.out.printf("\n");
            }else{
                System.out.printf(" ");
            }
        }
    }
}
