package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird {

    private String migrationMonth;

    public String move() {
        return "fly";
    }

    public void setMigrationMonth(String expected) {
        this.migrationMonth = expected;

    }

    public String getMigrationMonth() {
        return migrationMonth;
    }

    public String color() {
        return "red";
    }

    public int getSpeed(){

        return 2;
    }
}


