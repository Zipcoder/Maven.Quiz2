package com.zipcodewilmington.assessment2.part1;

import java.util.Arrays;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length%2==0;
    }

    public Integer[] range(int start, int stop) {
        Integer[] rangeArray = new Integer[stop - start + 1];
        int counter = 0;
        for (int i = start; i<=stop; i++){
            rangeArray[counter] = i;
            counter++;
            }


        return rangeArray;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length-1] * array[array.length-2];
    }
}
