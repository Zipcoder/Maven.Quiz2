package com.zipcodewilmington.assessment2.part3;

public class Horse implements Animal{
    public String color() {return "brown";}

    public String move() {return "gallop";}

    @Override
    public int getSpeed() {
        return 40;
    }
}
