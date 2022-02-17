package com.juan.topic1.musicplayer.setup;

public class Storage8gb implements Storage{

    public Storage8gb() {
        storage();
    }

    @Override
    public void storage() {
        System.out.println("Storage: 8gb");
    }
}
