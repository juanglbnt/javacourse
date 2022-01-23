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
        System.out.println("system processes\n" + memoryObj.returnSystemProcesses());
        System.out.println("is s001 in memory currently?: " + memoryObj.searchProcess(memoryObj.systemProcesses, "s005"));

    }

    public void startMemory(){

        for(int row = 0; row < memory.length; row++){
            for(int col = 0; col < memory[row].length; col++){
                memory[row][col] = "****";
            }
        }
    }

    public void showMemory(){

        for(int row = 0; row < memory.length; row++){
            for(int col = 0; col < memory[row].length; col++){
                System.out.print(memory[row][col] + " ");
            }
            System.out.println();
        }
    }

    public void systemProcess(){
        int size;
        int id = 0;
        String idProcesss = "s00" + id;
        size = 5 + random.nextInt(16 - 5);
        //parametros de prueba
        memory[3][9] = "s000";
        memory[0][2] = "s001";
        memory[0][3] = "s002";

        for(int row = 0; row < memory.length; row++){
            for(int col = 0; col < memory[row].length; col++){
                if(memory[row][col].contains(idProcesss)){
                    id++;
                }
            }
        }
        if(id > 10){
            idProcesss = "s0" + id;
        }else{
            idProcesss = "s00" + id;
        }

        System.out.println("the process " + idProcesss + " is already\n in memory THE NEW PROCESS IS: " + idProcesss);
    }

    public void aplicationProcess(){
        int size;
        size = 10 + random.nextInt(21 - 10);


    }

    public String returnSystemProcesses(){

        for(int row = 0; row < memory.length; row++){
            for(int col = 0; col < memory[row].length; col++){
                if(memory[row][col].contains("s")){
                    systemProcesses += memory[row][col] + " ";
                }
            }
        }
        return systemProcesses;
    }

    public boolean searchProcess(String processes, String id){
        boolean valid = false;
        for(int i = 0; i < processes.length(); i++){
            if(processes.contains(id)){
                valid = true;
            }
        }
        return valid;
    }


}
