package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird{

    private String migrationMonth;

    public String color() {
        return "red";
    }

    public int getSpeed() {
        return 10;
    }

    public void setMigrationMonth(String expected) {

        this.migrationMonth = expected;

    }

    public String getMigrationMonth() {

        return this.migrationMonth;
    }
}
