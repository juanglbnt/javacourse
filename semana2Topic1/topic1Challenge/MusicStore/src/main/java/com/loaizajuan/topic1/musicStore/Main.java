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
        int battery = 0;
        String color = "";
        int opt;
        PlayerBuilder basePlayer = new BasePlayer();
        PlayerConstructor playerConstructor = new PlayerConstructor(basePlayer);

        System.out.println("CUSTOMIZE YOUR PLAYER\n");
        System.out.print("seleccione la capacidad de almacenamiento [8gb - 16gb]: ");
        storage = in.nextInt();
        if(storage != 8 && storage != 16){
            System.out.println("no disponible");
        }else {
            playerConstructor.setStorage(storage);
            System.out.print("seleccione la duracion de la bateria [5hrs - 8hrs]: ");
            battery = in.nextInt();
            if(battery != 5 && battery != 8){
                System.out.println("no disponible");
            }else{
                playerConstructor.setBattery(battery);
                System.out.print("seleccione el color [verde - azul]: ");
                color = in.next();
                if((!color.equalsIgnoreCase("azul")) && (!color.equalsIgnoreCase("verde"))){
                    System.out.println("no disponible");
                }else{
                    playerConstructor.setColor(color);
                    Player thePlayer = playerConstructor.makePlayer();
                    System.out.println("the player is: " + thePlayer);
                }
            }
        }
    }
}