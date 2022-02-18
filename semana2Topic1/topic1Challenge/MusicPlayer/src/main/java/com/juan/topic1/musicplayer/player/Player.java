package com.juan.topic1.musicplayer.player;

import com.juan.topic1.musicplayer.factory.BaseSetUpFactory;

public class Player extends AbstractPlayer {

    BaseSetUpFactory setUpFactory;
    public Player(BaseSetUpFactory setUpFactory) {
        this.setUpFactory = setUpFactory;
    }

    @Override
    public void setUp(int storage, int battery, String color) {
        setUpFactory.setUpStorage(storage);
        setUpFactory.setUpBattery(battery);
        setUpFactory.setUpColor(color);
    }

}
