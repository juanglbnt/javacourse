package com.juan.topic1.musicplayer.setup;

public class Battery8h implements Battery{

    public Battery8h() {
        battery();
    }

    @Override
    public void battery() {
        System.out.println("Battery: 8hrs");
    }
}
