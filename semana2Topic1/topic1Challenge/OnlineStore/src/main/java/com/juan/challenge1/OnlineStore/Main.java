package com.juan.challenge1.OnlineStore;

import com.juan.challenge1.OnlineStore.product.*;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    Subject music = new MusicStream();
    Subject video = new AmazingVideo();
    Subject manga = new UltimateManga();

    public static void main(String[] args) {

        Main start = new Main();
        start.menu();
    }

    public void menu(){
        int opt;
        do {
            System.out.println("Menu\n1. usuario.\n2. admin\n0. salir\n");
            opt = in.nextInt();
            if(opt == 1){
                userMenu();
            }else if(opt == 2){
                adminMenu();
            }
        }while (opt == 1 || opt == 2);
    }

    public void userMenu(){
        int opt;
        String name;
        System.out.print("nombre: ");
        name = in.next();
        Observer newUser = new User(name);
        do {
            System.out.println("suscribirse a: \n1. Music Stream mensual $" + music.getPrice()
            + "\n2. Amazing video $" + video.getPrice() + "\n3. Manga Ultimate $" + manga.getPrice()
            + "\n0. salir");
            opt = in.nextInt();
            if (opt == 1){
                music.registerUser(newUser);
                System.out.println("Rgistrado con exito");
            }else if (opt == 2){
                video.registerUser(newUser);
                System.out.println("Rgistrado con exito");
            }else if(opt == 3){
                manga.registerUser(newUser);
                System.out.println("Rgistrado con exito");
            }
        }while (opt != 0);

    }

    public void adminMenu(){
        int opc;
        double price;
        do{
            System.out.print("actualizar precio \n1. amazing video\n2. music\n3. manga\n0. salir\n");
            opc = in.nextInt();
            if(opc == 1){
                System.out.print("nuevo precio: ");
                price = in.nextDouble();
                music.setPrice(price);
            }else if (opc == 2){
                System.out.print("nuevo precio: ");
                price = in.nextDouble();
                video.setPrice(price);
            }else if (opc == 3){
                System.out.print("nuevo precio: ");
                price = in.nextDouble();
                manga.setPrice(price);
            }
        }while (opc != 0);
    }



}
