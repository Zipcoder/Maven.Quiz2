package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if (array.length % 2 == 0)
            return true;
        else
            return false;
    }

    public Integer[] range(int start, int stop) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = start; i <= stop; i++) {
            list.add(i);
        }

        Integer[] newArr = list.toArray(new Integer[0]);
        return newArr;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        Integer sum = array[0] + array[1];
        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        Integer product = array[array.length-1] * array[array.length-2];
        return product;
    }
}
