package com.zipcodewilmington.assessment2.part3;

public class Bird implements Animal { ;
    private String migrationMonth;
    public int getSpeed(){return 0;}
    public String color(){return "";};

    public String move() {
        return "fly";
    }

    public void setMigrationMonth(String expected) {
            this.migrationMonth = expected;
    }

    public String getMigrationMonth() {
        return null;
    }
}
