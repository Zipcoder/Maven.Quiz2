package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird{
    public String getMigrationMonth() {
        return migrationMonth;
    }

    public void setMigrationMonth(String migrationMonth) {
        this.migrationMonth = migrationMonth;
    }

    String migrationMonth = "";
    public String color(){
        return "red";
    }
    public int speed (){
        return 10;
    }
}
