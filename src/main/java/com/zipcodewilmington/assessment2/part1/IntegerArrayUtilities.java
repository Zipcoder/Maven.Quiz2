package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;
import java.util.List;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {

        return array.length%2==0;
    }

    public Integer[] range(int start, int stop) {
        List<Integer> list= new ArrayList<>();
        for (int i = start; i < stop+1; i++) {
            list.add(i);
        }
        Integer[] result = new Integer[list.size()];
        result = list.toArray(result);
        return result;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        return array[0]+array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {

        return array[array.length-1]*array[array.length-2];
    }
}
