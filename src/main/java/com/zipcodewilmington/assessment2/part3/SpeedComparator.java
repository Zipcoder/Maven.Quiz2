package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal animal, Animal t1) {
        return t1.getSpeed()-animal.getSpeed();
    }
}
