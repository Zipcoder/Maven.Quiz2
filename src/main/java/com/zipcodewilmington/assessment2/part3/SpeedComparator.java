package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {

    public int compare(Animal animal1, Animal animal2) {
        return (animal2.getSpeed() > animal1.getSpeed()) ? 1 : (animal1.getSpeed() == animal2.getSpeed()) ? 0 : -1;
    }
}
