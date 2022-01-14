package excercises1;

public class CheckPassFail {

    public static void passFail(int mark){

        System.out.print("the mark is " + mark);
        if (mark >= 50){
            System.out.print(" -> pass");
        }else{
            System.out.print(" -> fail");
        }
        System.out.println("\ndone");
    }
}
