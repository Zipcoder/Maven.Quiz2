package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;


public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {

        if(array.length == 0 || array.length % 2 == 0)
            return true;

        return false;
    }

    public Integer[] range(int start, int stop) {
        ArrayList<Integer> temp = new ArrayList<>();

        for(int first = start; first <= stop; first++){
            temp.add(first);
        }

        Integer[] result = new Integer[temp.size()];
        result = temp.toArray(result);

        return result;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        Integer sumFirstTwo = array[0] + array[1];

        return sumFirstTwo;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {

       Integer productLastTwo = array[array.length - 1] * array[array.length - 2];

        return productLastTwo;
    }
}
