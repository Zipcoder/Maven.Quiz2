package com.zipcodewilmington.assessment2.part3;

public class BlueJay extends Bird implements Animal{
    public String move() {
        return "fly";
    }
    public  int getSpeed(){
        return 0;
    }

    public String color(){
        return "blue";
    }
}
