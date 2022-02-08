package com.loaizajuan.factoryExercise;

public class Automovil implements Transporte{

    @Override
    public void arrancar() {
        System.out.println("Arrancando el auto");

    }

    @Override
    public void detener() {
        System.out.println("reduciendo velocidad del auto");
    }

    @Override
    public String tipo() {
        return "automovil";
    }
}
