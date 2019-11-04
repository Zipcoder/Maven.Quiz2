package com.zipcodewilmington.assessment2.part3;

public abstract class Bird implements Animal {

    String migration;

   public abstract String move();
   public abstract String color();
   public abstract int getSpeed();

    public void setMigrationMonth(String expected) {
        this.migration = expected;

    }

    public String getMigrationMonth() {
        return migration;
    }


}
