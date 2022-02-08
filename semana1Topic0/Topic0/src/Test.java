import java.util.*;

public class Test {
    ArrayList<String> memory = new ArrayList<>();
    List<String> memoryCopy = new ArrayList<>();
    static Scanner in = new Scanner(System.in);
    final String MEMORY_ITEMS = "****";
    String matrixMemory[][] = new String[5][4];
    Random random = new Random();
    ArrayList<String> memory2 = new ArrayList<>(20);

    public static void main(String[] args) {

        String opc = "";
        Test obj2 = new Test();

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
                //obj2.fillMatrixMemory();
            }
            else{
                continue;
            }


        }while(!(opc.equalsIgnoreCase("0")));
    }

    public void startMemory(){
        for(int i = 0; i < 20; i++){
            memory.add(MEMORY_ITEMS);
        }
    }

    public void fillMatrixMemory(){
        int counter = 0;
        for(int row = 0; row < 5; row++){
            for(int col = 0; col < 4; col++){
                matrixMemory[row][col] = memory.get(counter);
                counter++;
            }
        }
    }

    //**************************************************

    public void printMemory(){
        for(int row = 0; row < 5; row++){
            for(int col = 0; col < 4; col++){
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

        size = 2 + random.nextInt(5 - 2);

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

        System.out.println("the new process with id: " + idProcess + " and size: " + size +
                " was store to memory");

    }

    //Application process
    public void appProcess(){
        int size = 0;
        int id = 0;
        String idProcess = "";
        List<String> listProcess = new ArrayList<>();
        size = 2 + random.nextInt(5 - 2);
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

            System.out.println("THISSSS:" + memory.get(19));
        }

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
            fitMemory();
        }else{
            System.err.println("the process " + id + " is not stored in memory");
        }
        System.out.println("\nPROCESS DELETED");
        fillMatrixMemory();
        printMemory();
        //until here is correct
    }

    //fit the memory to avoid free spaces between processes
    public void fitMemory(){
        //fill the copy with the processes to save the processes
        for(int i = 0; i < memory.size(); i++){
            if(!(memory.get(i).equalsIgnoreCase(MEMORY_ITEMS))){
                memoryCopy.add(memory.get(i));
            }
        }//until here is perfect

        //"clean" main memory
        for(int i =0; i < memory.size(); i++){
            if(!(memory.get(i).equalsIgnoreCase(MEMORY_ITEMS))){
                memory.set(i, MEMORY_ITEMS);
            }
        }
        fillMatrixMemory();
        //System.out.println("\nmemoria reiniciada\n");
        //printMemory();
        //CORRECT UNTIL HERE

        System.out.println("COPY OF THE MEMORY: \n");
        printCopy();
        System.out.println();
        //CORRECT UNTIL HERE
        //store processes saved in memory
        //*********************************
        int memIndex = 19;
        for(int i = memoryCopy.size()-1; i >= 0; i--){
            memory.set(memIndex, memoryCopy.get(i));
            memIndex--;
        }
        //*********************************
      //  for(int i = 0; i < memoryCopy.size(); i++){
        //    memory.remove(i);
        //}//HERE IS THE ERROR
        //memory.addAll(memoryCopy);

        System.out.println("\nMEMORY NOW ORGANIZED\n");
        fillMatrixMemory();
        printMemory();
        memoryCopy.clear();
    }

    public void watchProcesses(){
        int processes = 0;
        for(int i = 0; i < memory.size(); i++){
            if(!(memory.get(i).equalsIgnoreCase(MEMORY_ITEMS))){
                processes++;
            }
        }
        System.out.println("\n**processes**" + processes + "\n");
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
