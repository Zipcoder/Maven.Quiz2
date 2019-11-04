package com.zipcodewilmington.assessment2.part3;

public class BlueJay extends Bird{
    @Override
    public String getMigrationMonth() {
        return migrationMonth;
    }

    @Override
    public void setMigrationMonth(String migrationMonth) {
        this.migrationMonth = migrationMonth;
    }

    String migrationMonth = "";
    public String color (){
        return "blue";
    }
    public int speed(){
        return 10;
    }

}
