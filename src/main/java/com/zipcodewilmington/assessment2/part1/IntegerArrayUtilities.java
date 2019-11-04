package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length % 2 == 0;
    }

    public Integer[] range(int start, int stop) {
        Integer[]numRange = new Integer[Math.abs((stop-start)+1)];
        for (int i = 0; i < numRange.length; i++) {
            numRange[i]= start+i;
        }
        return numRange;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length-1] * array[array.length-2];
    }
}
