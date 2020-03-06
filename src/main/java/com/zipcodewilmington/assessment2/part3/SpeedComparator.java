package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal>
{

    @Override
    public int compare(Animal first, Animal second) {
        return  second.getSpeed() - first.getSpeed();
    }
}
