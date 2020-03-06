package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird{
    public int getSpeed() {
        return 1;
    }

    public String color() {
        return "red";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
