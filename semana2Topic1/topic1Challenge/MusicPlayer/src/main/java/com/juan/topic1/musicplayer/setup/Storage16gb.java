package com.juan.topic1.musicplayer.setup;

public class Storage16gb implements Storage{

    public Storage16gb() {
        storage();
    }

    @Override
    public void storage() {
        System.out.println("Storage: 16gb");
    }
}
