package com.juan.topic1.musicplayer.factory;

import com.juan.topic1.musicplayer.player.AbstractPlayer;
import com.juan.topic1.musicplayer.player.Player;

import java.util.Scanner;

public class PlayerFactory extends BasePlayerFactory{

    Scanner in = new Scanner(System.in);
    int storageIn;
    int batteryIn;
    String colorIn;

    @Override
    public void getData(){

        System.out.print("select the storage [8gb - 16]: ");
        storageIn = in.nextInt();
        System.out.print("select the battery [5hrs - 8hrs]: ");
        batteryIn = in.nextInt();
        System.out.print("select the color [blue - green]: ");
        colorIn = in.next();

        makePlayer(storageIn, batteryIn, colorIn);
    }

    @Override
    public AbstractPlayer makePlayer(int storage, int battery, String color) {
        AbstractPlayer abstractPlayer;
        BaseSetUpFactory setUpFactory = new SetUpFactory();

        System.out.println("the new music player has been customized with:");
        setUpFactory.setUpStorage(storage);
        setUpFactory.setUpBattery(battery);
        setUpFactory.setUpColor(color);

        abstractPlayer = new Player(setUpFactory);
        abstractPlayer.createPlayer();
        return abstractPlayer;
    }
}
