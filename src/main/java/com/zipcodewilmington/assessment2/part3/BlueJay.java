package com.zipcodewilmington.assessment2.part3;

public class BlueJay extends Bird {


    @Override
    public String move() {
        return "fly";
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public String color() {
        return "blue";
    }
}
