package com.loaizajuan.topic1.musicStore.director;

import com.loaizajuan.topic1.musicStore.builder.PlayerBuilder;
import com.loaizajuan.topic1.musicStore.product.Player;

public class PlayerConstructor {
    private PlayerBuilder playerBuilder;
    private int storage;
    private int battery;
    private String color;

    public PlayerConstructor(PlayerBuilder playerBuilder){
        this.playerBuilder = playerBuilder;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Player makePlayer(){
        this.playerBuilder.buildStorage(storage);
        this.playerBuilder.buildBattery(battery);
        this.playerBuilder.buildColor(color);

        return this.playerBuilder.getPlayer();
    }
}
