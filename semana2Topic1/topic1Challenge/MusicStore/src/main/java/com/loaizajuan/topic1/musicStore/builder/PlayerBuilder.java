package com.loaizajuan.topic1.musicStore.builder;

import com.loaizajuan.topic1.musicStore.product.Player;

public interface PlayerBuilder {
    void buildStorage(int storage);
    void buildBattery(int batteryRate);
    void buildColor(String color);

    Player getPlayer();
}
