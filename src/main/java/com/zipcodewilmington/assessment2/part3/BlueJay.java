package com.zipcodewilmington.assessment2.part3;

public class BlueJay extends Bird implements Comparable{
    public int getSpeed() {
        return 2;
    }

    public String color() {
        return "blue";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
