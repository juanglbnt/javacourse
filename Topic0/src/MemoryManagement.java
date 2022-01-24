import java.util.Random;

public class MemoryManagement {
    Random random = new Random();
    String[][] memory = new String[20][10];
    String systemProcesses = "";

    public static void main(String[] args) {
        MemoryManagement memoryObj = new MemoryManagement();

        memoryObj.startMemory();
        memoryObj.systemProcess();
        memoryObj.showMemory();



    }

    public void startMemory() {

        for (int row = 0; row < memory.length; row++) {
            for (int col = 0; col < memory[row].length; col++) {
                memory[row][col] = "****";
            }
        }
    }

    public void showMemory() {

        for (int row = 0; row < memory.length; row++) {
            for (int col = 0; col < memory[row].length; col++) {
                System.out.print(memory[row][col] + " ");
            }
            System.out.println();
        }
    }

    public void systemProcess(){
        int size;
        int id = 0;
        String idProcesss;
        size = 5 + random.nextInt(16 - 5);
        //parametros de prueba
        /*memory[3][9] = "s000";
        memory[0][2] = "s001";
        memory[0][1] = "s002";
        memory[0][4] = "s003";
        memory[0][3] = "s004";
        memory[0][5] = "s005";
        memory[0][6] = "s006";
        memory[1][1] = "s007";
        memory[1][2] = "s008";
        memory[1][3] = "s009";
        memory[1][4] = "s010";*/

        idProcesss = "s00" + id;

        while(searchProcess(idProcesss)){
            id++;
            if(id > 9){
                idProcesss = "s0" + id;
            }else{
                idProcesss = "s00" + id;
            }

        }
        System.out.println("THE NEW PROCESS IN MEMORY IS: " + idProcesss);
        System.out.println("with size: " + size);

        for(int i = 0; i < size; i++){
            for(int row = 0; row < memory.length; row++){
                for(int col = 0; col < memory[row].length; col++){
                    memory[row][col] = idProcesss;
                }
            }
        }

    }

    public void aplicationProcess() {
        int size;
        size = 10 + random.nextInt(21 - 10);


    }

    /*idElement = "s00" + id;
        System.out.println("ID TO CHECK: " + idElement);
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                if(matrix[row][col].equalsIgnoreCase(idElement)){
                    id++;
                }
            }

        }*/

    public boolean searchProcess(String id) {
        int counter = 0;
        boolean valid = false;

        for(int row = 0; row < memory.length; row++) {
            for(int col = 0; col < memory[row].length; col++){
                if(memory[row][col].equalsIgnoreCase(id)){
                    counter++;
                }
            }
        }

        valid = (counter > 0);
        return valid;

    }
}
