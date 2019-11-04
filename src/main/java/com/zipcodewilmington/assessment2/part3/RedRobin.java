package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird implements Animal {
    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public String color() {
        return "red";
    }
//    @Override
//    public String move(){
//        return "fly";
//    }
}
