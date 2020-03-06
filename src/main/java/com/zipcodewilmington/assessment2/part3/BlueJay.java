package com.zipcodewilmington.assessment2.part3;

public class BlueJay extends Bird {
    @Override
    public String move() {

        return "fly";
    }
    @Override
    public String color() {
        return "blue";
    }

    @Override
    public int getSpeed() {
        return 5;
    }
}
