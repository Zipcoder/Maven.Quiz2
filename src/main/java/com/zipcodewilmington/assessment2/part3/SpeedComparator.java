package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal obj1, Animal obj2) {
        return obj1.getSpeed() - obj2.getSpeed();
    }
}
