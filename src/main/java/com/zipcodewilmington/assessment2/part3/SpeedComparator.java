package com.zipcodewilmington.assessment2.part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SpeedComparator implements Comparator<Animal> {

        List<Animal> SpeedCompare = new ArrayList<Animal>();
    public int compare(Animal animal1, Animal animal2) {
        if (animal1.getSpeed() == animal2.getSpeed())
            return 0;
        else if (animal1.getSpeed() > animal2.getSpeed())
            return 1;
        else return -1;
    }
}
