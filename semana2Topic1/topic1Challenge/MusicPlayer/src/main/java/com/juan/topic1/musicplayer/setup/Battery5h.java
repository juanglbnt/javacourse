package com.juan.topic1.musicplayer.setup;

public class Battery5h implements Battery{

    public Battery5h() {
        battery();
    }

    @Override
    public void battery() {
        System.out.println("battery: 5hrs");;
    }
}
