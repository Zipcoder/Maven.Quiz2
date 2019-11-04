package com.zipcodewilmington.assessment2.part3;

public class Horse implements Animal{
    String color = "brown";

    public String color() {
        return color;
    }

    public int getSpeed() {
        return 40;
    }

    public String move() {
        return "gallop";
    }
}
