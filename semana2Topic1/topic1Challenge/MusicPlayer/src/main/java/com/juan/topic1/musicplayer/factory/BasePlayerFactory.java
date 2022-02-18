package com.juan.topic1.musicplayer.factory;

import com.juan.topic1.musicplayer.player.AbstractPlayer;
import com.juan.topic1.musicplayer.player.Player;

public abstract class BasePlayerFactory {

    public abstract void getData();
    public abstract AbstractPlayer makePlayer(int storage, int battery, String color);
}
