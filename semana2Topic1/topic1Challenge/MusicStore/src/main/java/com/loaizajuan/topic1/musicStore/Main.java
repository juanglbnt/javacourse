package com.loaizajuan.topic1.musicStore;

import com.loaizajuan.topic1.musicStore.builder.BasePlayer;
import com.loaizajuan.topic1.musicStore.builder.PlayerBuilder;
import com.loaizajuan.topic1.musicStore.director.PlayerConstructor;
import com.loaizajuan.topic1.musicStore.product.Player;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int storage;
        int battery;
        String color;
        int opt;
        boolean strgValid = false;
        boolean bryValid = false;
        boolean colorValid = false;
        PlayerBuilder basePlayer = new BasePlayer();
        PlayerConstructor playerConstructor = new PlayerConstructor(basePlayer);

        System.out.println("ELIGE TU REPRODUCTOR\n");

        do {
            System.out.print("seleccione la capacidad de almacenamiento [8gb - 16gb]: ");
            storage = in.nextInt();

            if(storage != 8 && storage != 16){
                System.out.println("seleccione un valor correcto [8 - 16]");
            }else{
                strgValid = true;
                playerConstructor.setStorage(storage);
            }

        }while (!strgValid);

        do {
            System.out.print("seleccione la capacidad de bateria deseada [5hrs - 8hrs]: ");
            battery = in.nextInt();

            if(battery != 8 && battery != 5){
                System.out.println("por favor seleccione una opcion correcta [5 - 8]");
            }else {
                bryValid = true;
                playerConstructor.setBattery(battery);
            }

        }while (!bryValid);

        do {
            System.out.print("seleccione el color que desea [azul - verde]: ");
            color = in.next();

            if((!color.equalsIgnoreCase("azul")) && (!color.equalsIgnoreCase("verde"))){
                System.out.println("por favor elija un color correcto [azul - verde]");
            }else{
                colorValid = true;
                playerConstructor.setColor(color);
            }

        }while (!colorValid);

        Player thePlayer = playerConstructor.makePlayer();
        System.out.println("you new player: " + thePlayer);

    }
}