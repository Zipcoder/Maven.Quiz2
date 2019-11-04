package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird
{
    private String migMonth;

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
        return migMonth;
    }
    public void setMigrationMonth(String migrationMonth) {
        this.migMonth = migrationMonth;
    }
}
