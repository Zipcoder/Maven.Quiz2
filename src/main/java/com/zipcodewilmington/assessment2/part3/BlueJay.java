package com.zipcodewilmington.assessment2.part3;

public class BlueJay extends Bird{
    public String color() {return "blue";}

    public String move() {return "fly";}

    @Override
    public int getSpeed() {
        return 13;
    }
}
