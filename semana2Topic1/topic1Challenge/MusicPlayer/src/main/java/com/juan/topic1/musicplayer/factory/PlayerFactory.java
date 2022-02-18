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

        System.out.println("customize your new music player");

        do {
            System.out.print("select the storage [8gb - 16]: ");
            storageIn = in.nextInt();

            if(!isValidStorage(storageIn))
                System.out.println("try again, select a valid option");

        }while(!isValidStorage(storageIn));

        do {
            System.out.print("select the battery [5hrs - 8hrs]: ");
            batteryIn = in.nextInt();

            if(!isValidBattery(batteryIn))
                System.out.println("try again, select a valid option");

        }while(!isValidBattery(batteryIn));

        do {
            System.out.print("select the color [blue - green]: ");
            colorIn = in.next();

            if(!isValidColor(colorIn))
                System.out.println("try again, select a valid option");

        }while(!isValidColor(colorIn));

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

    public boolean isValidBattery(int value) {
        if((value == 5) || (value == 8)) {
            return true;
        }else {
            return false;
        }
    }

    public boolean isValidStorage(int value) {
        if((value == 8) || (value == 16)) {
            return true;
        }else {
            return false;
        }
    }

    public boolean isValidColor(String value) {
        if((value.equalsIgnoreCase("blue")) ||
                (value.equalsIgnoreCase("green"))) {
            return true;
        }else {
            return false;
        }
    }
}
