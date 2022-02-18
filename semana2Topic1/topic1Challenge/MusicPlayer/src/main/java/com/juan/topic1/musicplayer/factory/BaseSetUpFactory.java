package com.juan.topic1.musicplayer.factory;

import com.juan.topic1.musicplayer.setup.Battery;
import com.juan.topic1.musicplayer.setup.Color;
import com.juan.topic1.musicplayer.setup.Storage;

public abstract class BaseSetUpFactory {
    /*public abstract Storage setUpStorage();
    public abstract Battery setUpBattery();
    public abstract Color setUpColor();*/

    public abstract Storage setUpStorage(int storage);
    public abstract Battery setUpBattery(int battery);
    public abstract Color setUpColor(String color);
}
