package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal animal, Animal animal2) {
        int comparator=0;
        if(animal.getSpeed() == animal2.getSpeed()){
            comparator = 0;}
        else if(animal.getSpeed() > animal2.getSpeed()){
            comparator = -1;}
        else if (animal.getSpeed() < animal2.getSpeed()){
            comparator = 1;
        }
        return comparator;
    }
}
