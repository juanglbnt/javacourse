import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Memory2 {

    ArrayList<String> memory = new ArrayList<>();
    ArrayList<String> memoryCopy = new ArrayList<>();
    String[][] matrixMemory = new String[20][10];
    Random random = new Random();
    public final String MEMORY_ITEMS = "****";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Memory2 obj2 = new Memory2();
        String opc = "";
        String processToCreate;

        obj2.startMemory();

        do{
            System.out.println("Welcome");
            System.out.println("write a command or type 0 to exit");
            opc = in.nextLine();
            String idToDelete;

            if(opc.equalsIgnoreCase("cs")){
                obj2.systemProcess();
                obj2.fillMatrixMemory();
                obj2.printMemory();
            }else if(opc.equalsIgnoreCase("ca")){
                obj2.appProcess();
                obj2.fillMatrixMemory();
                obj2.printMemory();
            }else if(opc.charAt(0) == 'd'){
                idToDelete = opc.substring(1);
                obj2.deleteProcess(idToDelete);
                obj2.fillMatrixMemory();
                obj2.fitMemory();
                obj2.fillMatrixMemory();
                obj2.printMemory();
            }
            else{
                continue;
            }


        }while(!(opc.equalsIgnoreCase("0")));

        // always necessary
        //obj2.fillMatrixMemory();
        //obj2.printMemory();

    }

    public void startMemory(){
        for(int i = 0; i < 200; i++){
            memory.add(MEMORY_ITEMS);
        }
    }

    //only used to verify the original main memory
    public void showArray(){
        for(int i = 0; i < memory.size(); i++){
            System.out.print(memory.get(i) + " ");
        }
    }


    public void fillMatrixMemory(){
        int counter = 0;
        for(int row = 0; row < 20; row++){
            for(int col = 0; col < 10; col++){
                matrixMemory[row][col] = memory.get(counter);
                counter++;
            }
        }
    }

    public void printMemory(){
        for(int row = 0; row < 20; row++){
            for(int col = 0; col < 10; col++){
                System.out.print(matrixMemory[row][col] + "  ");
            }
            System.out.println();
        }
    }

    public int memoryCurrentSpace(){
        int space = 0;
        for(int i = 0; i < memory.size(); i++){
            if(memory.get(i).equalsIgnoreCase(MEMORY_ITEMS)){
                space++;
            }
        }
        return space;
    }

    public void systemProcess(){
        int size = 0;
        int id = 0;
        String idProcess = "";
        List<String> listProcess = new ArrayList<>();
        int memorySpace;

        memorySpace = memoryCurrentSpace();

        size = 5 + random.nextInt(16 - 5);

        idProcess = "s00" + id;

        while(memory.contains(idProcess)) {
            id++;
            if (id > 9) {
                idProcess = "s0" + id;
            } else {
                idProcess = "s00" + id;
            }
        }

        for(int i = 0; i < size; i++){
            listProcess.add(idProcess);
        }

        if(size > memorySpace){
            System.err.println("memory over flow\nmemory space: " + memorySpace);
        }else{
            for(int i = 0; i < listProcess.size(); i++){
                memory.remove(i);
                memory.add(idProcess);
            }
        }

        System.out.println("space in memory = " + memorySpace);
        System.out.println("the new process with id: " + idProcess + " and size: " + size +
                " was store to memory");

    }

    //Application process
    public void appProcess(){
        int size = 0;
        int id = 0;
        String idProcess = "";
        List<String> listProcess = new ArrayList<>();
        size = 5 + random.nextInt(16 - 5);
        int memorySpace;

        memorySpace = memoryCurrentSpace();

        idProcess = "a00" + id;

        while(memory.contains(idProcess)) {
            id++;
            if (id > 9) {
                idProcess = "a0" + id;
            } else {
                idProcess = "a00" + id;
            }
        }

        for(int i = 0; i < size; i++){
            listProcess.add(idProcess);
        }


        if(size > memorySpace){
            System.err.println("memory over flow\nmemory space: " + memorySpace);
        }else{
            for(int i = 0; i < listProcess.size(); i++){
                if(memory.get(i).equalsIgnoreCase(MEMORY_ITEMS)){
                    memory.remove(i);
                    memory.add(idProcess);
                }

            }
        }

        System.out.println("space in memory: " + memorySpace);
        System.out.println("the new process with id: " + idProcess + " and size: " + size +
                " was store to memory");
    }


    //delete a process stored in memory
    public void deleteProcess(String id){

        if(searchProcess(id)){
            for(int i = 0; i < memory.size(); i++){
                if(memory.get(i).equalsIgnoreCase(id)){
                    memory.set(i, MEMORY_ITEMS);
                }
            }
        }else{
            System.err.println("the process " + id + " is not stored in memory");
        }


    }

    //fit the memory to avoid free spaces between processes
    public void fitMemory(){
        //fill the copy with the processes to save the processes
        for(int i = 0; i < memory.size(); i++){
            if(!(memory.get(i).equalsIgnoreCase(MEMORY_ITEMS))){
                memoryCopy.add(memory.get(i));
            }
        }

        //"clean" main memory
        memory.clear();
        startMemory();

        //store processes saved in memory
        for(int i = 0; i < memoryCopy.size(); i++){
            memory.remove(i);
            memory.add(memoryCopy.get(i));
        }

        memoryCopy.clear();

    }

    //only to test. used to verify when necessary
    public void printCopy(){
        for(int i = 0; i < memoryCopy.size(); i++){
            System.out.print(memoryCopy.get(i) + " ");
        }
    }

    public boolean searchProcess(String id){
        boolean valid = false;

        if(memory.contains(id)){
            valid = true;
        }

        return valid;
    }
}