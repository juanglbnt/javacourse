package com.loaizajuan.topic1.musicStore.builder;

import com.loaizajuan.topic1.musicStore.product.Player;

public class BasePlayer implements PlayerBuilder{
    private Player player;

public BasePlayer(){
    this.player = new Player();
}

    @Override
    public void buildStorage(int storage) {
        player.setStorage(storage);
    }

    @Override
    public void buildBattery(int batteryRate) {
        player.setBatteryRate(batteryRate);
    }

    @Override
    public void buildColor(String color) {
        player.setColor(color);
    }

    public Player getPlayer(){
        System.out.println("the new player is ready...");
        return this.player;
    }
}
