package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird {


    String migrationMonth;

    @Override
    public String getMigrationMonth() {
        return "August";
    }

    @Override
    public int getSpeed() {
        return 10;
    }

    @Override
    public String color() {
        return "red";
    }

}
