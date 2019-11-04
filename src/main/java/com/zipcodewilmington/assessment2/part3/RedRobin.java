package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird implements Animal {
    String migrationMonth;

    public String color() {
        return "red";
    }

    public int getSpeed() {
        return 10;
    }

    public String getMigrationMonth() {
        return this.migrationMonth;
    }

    public void setMigrationMonth(String month) {
        this.migrationMonth = month;
    }
}
