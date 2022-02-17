package com.juan.topic1.musicplayer.client;

import com.juan.topic1.musicplayer.factory.BasePlayerFactory;
import com.juan.topic1.musicplayer.factory.PlayerFactory;

public class Main {

    public static void main(String[] args) {
        BasePlayerFactory playerFactory = new PlayerFactory();
        playerFactory.getData();
    }
}
