package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird {
    private String migrationMonth = "";
    @Override
    public String move() {

        return "fly";
    }
    @Override
    public String color() {
        return "red";
    }

    public void setMigrationMonth(String expected) {
        this.migrationMonth = expected;
    }

    public String getMigrationMonth() {
        return this.migrationMonth;
    }

    @Override
    public int getSpeed() {
        return 1;
    }
}

