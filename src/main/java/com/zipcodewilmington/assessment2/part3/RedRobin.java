package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird {
    String migrationMonth;

    public void setMigrationMonth(String updatedMonth)
    {
        migrationMonth = updatedMonth;
    }

    public String getMigrationMonth()
    {
        return migrationMonth;
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
