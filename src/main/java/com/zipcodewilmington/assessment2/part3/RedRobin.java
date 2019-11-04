package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird implements Animal{


    public RedRobin(){

    }

    @Override
    public int getSpeed() {
        return 10;
    }

    @Override
    public String color() {
        return "red";
    }

    @Override
    public String move() {
        return super.move();
    }

    @Override
    public String getMigrationMonth() {
        return super.getMigrationMonth();
    }

    @Override
    public void setMigrationMonth(String expected) {
        super.setMigrationMonth(expected);
    }
}





