package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;
import java.util.List;

public class IntegerArrayUtilities {

    public Boolean hasEvenLength(Integer[] array) {
        return  array.length % 2 == 0;
    }

    public Integer[] range(int start, int stop) {
        ArrayList<Integer> range = new ArrayList();
        for (int i = start; i <= stop; i++ ) {
            range.add(i);
        } return range.toArray(new Integer[0]);
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[0] * array[1];
    }

    public Integer getProductOfLastTwo(Integer[] array) {
        return array[array.length-1] * array[array.length-2];
    }
}
