package com.loaizajuan.topic1.musicStore.product;

public class Player {
    private int storage;
    private int batteryRate;
    private String color;

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setBatteryRate(int batteryRate) {
        this.batteryRate = batteryRate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Player{" +
                "storage=" + storage +
                ", batteryRate=" + batteryRate +
                ", color='" + color + '\'' +
                '}';
    }
}
