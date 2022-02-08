package com.loaizajuan.factoryExercise;

public class Fabrica {

    public static Transporte construir(String tipo){
        switch (tipo){
            case "motocicleta":
                return new Motocicleta();
            case "automovil":
                return new Automovil();
            default:
                System.out.println("no existe este transporte en la fabrica");
                return null;
        }
    }
}
