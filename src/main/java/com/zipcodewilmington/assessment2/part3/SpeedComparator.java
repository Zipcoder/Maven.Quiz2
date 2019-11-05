package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {
    public int compare(Animal animal1, Animal animal2) {

        Integer speed1 = animal1.getSpeed();
        Integer speed2 = animal2.getSpeed();

        //  return  compare(animal1, animal2);}

        return speed1.compareTo(speed2);
    }
}

