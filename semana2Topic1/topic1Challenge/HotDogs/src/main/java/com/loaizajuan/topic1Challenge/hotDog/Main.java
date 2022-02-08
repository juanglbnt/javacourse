package com.loaizajuan.topic1Challenge.hotDog;

import com.loaizajuan.topic1Challenge.hotDog.additions.*;
import com.loaizajuan.topic1Challenge.hotDog.components.BaseHotDog;
import com.loaizajuan.topic1Challenge.hotDog.components.HotDog;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BaseHotDog basicHotDog = new HotDog();
        BaseHotDog decoratedHotDog = new HotDog();
        int opc;

        System.out.println("1. hot dog basico\n2. con adiciones");
        opc = in.nextInt();
        if (opc == 1){
            System.out.println(basicHotDog.getDescription() + "precio: " + basicHotDog.cost());
        }else{
            do{
                System.out.println("elija las adiciones que desee para su hot dog");
                System.out.println("0. terminar.\n1. queso.\n2. tocineta.\n3. chili." +
                        "\n4. papitas.\n5. pepinillos.\n6. piña.\n7. salsa de tomate." +
                        "\n8. salsa mostaza.\n9. salsa picante\n");
                opc = in.nextInt();

                switch (opc){
                    case 1:
                        decoratedHotDog = new Cheese(decoratedHotDog);
                        break;
                    case 2:
                        decoratedHotDog = new Bacon(decoratedHotDog);
                        break;
                    case 3:
                        decoratedHotDog = new Chili(decoratedHotDog);
                        break;
                    case 4:
                        decoratedHotDog = new Fries(decoratedHotDog);
                        break;
                    case 5:
                        decoratedHotDog = new Pickles(decoratedHotDog);
                        break;
                    case 6:
                        decoratedHotDog = new Pinneaple(decoratedHotDog);
                        break;
                    case 7:
                        decoratedHotDog = new TomatoSauce(decoratedHotDog);
                        break;
                    case 8:
                        decoratedHotDog = new MustardSauce(decoratedHotDog);
                        break;
                    case 9:
                        decoratedHotDog = new HotSauce(decoratedHotDog);
                        break;
                }

            }while (opc != 0);
            System.out.println("Su nuevo hot dog con adiciones: ");
            System.out.println(decoratedHotDog.getDescription() + "precio: " + decoratedHotDog.cost());
        }




    }
}
