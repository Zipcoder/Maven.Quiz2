package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird{
    @Override
    public int getSpeed() {
        return 10;
    }

    @Override
    public String color() {
        return "red";
    }

    @Override
    public String getMigrationMonth() {
        return "August";
    }

    @Override
    public void setMigrationMonth(String expected) {
        super.setMigrationMonth(expected);
    }
}

