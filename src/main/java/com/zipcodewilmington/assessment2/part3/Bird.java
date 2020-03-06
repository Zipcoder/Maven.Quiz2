package com.zipcodewilmington.assessment2.part3;

public abstract class Bird implements Animal {
    public String move()
    {
        return "fly";
    }

    @Override
    abstract public int getSpeed();

    @Override
    abstract public String color();

    public void setMigrationMonth(String expected)
    {

    }

    public String getMigrationMonth() {
        return null;
    }
}
