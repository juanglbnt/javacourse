package com.loaizajuan.factoryExercise;

public class Motocicleta implements Transporte{

    @Override
    public void arrancar() {
        System.out.println("arrancando la motocicleta");
    }

    @Override
    public void detener() {
        System.out.println("disminuyendo la velocidad de la motocicleta");
    }

    @Override
    public String tipo() {
        return "motocicleta";
    }
}
