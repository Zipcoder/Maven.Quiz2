package com.zipcodewilmington.assessment2.part3;

public class Horse implements Animal{
    String move;
    String color;

    public Horse() {
        this.move="gallop";
        this.color="brown";
    }

    @Override
    public String move() { return move; }

    @Override
    public String color() { return color; }

    @Override
    public int getSpeed() { return 20; }
}
