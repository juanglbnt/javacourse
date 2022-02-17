package com.juan.topic1.musicplayer.factory;

import com.juan.topic1.musicplayer.setup.*;
import com.juan.topic1.musicplayer.setup.*;

public class SetUpFactory extends BaseSetUpFactory {

    @Override
    public Storage setUpStorage(int storage) {
        switch (storage) {
            case 8:
                return new Storage8gb();
            case 16:
                return new Storage16gb();
            default:
                System.out.println("ERROR");
                return null;
        }
    }

    @Override
    public Battery setUpBattery(int battery) {
        switch (battery) {
            case 5:
                return new Battery5h();
            case 8:
                return new Battery8h();
            default:
                System.out.println("ERROR");
                return null;

        }
    }

    @Override
    public Color setUpColor(String color) {
        switch (color) {
            case "blue":
                return new Blue();
            case "green":
                return new Green();
            default:
                System.out.println("ERROR");
                return null;
        }
    }
}
