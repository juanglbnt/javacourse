package com.juan.topic1.musicplayer.player;

public abstract class AbstractPlayer {
    public abstract void setUp(int storage, int battery, String color);
    public void createPlayer(){
        System.out.println("enjoy your new music player");
    }
}
