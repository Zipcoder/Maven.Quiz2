package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length % 2 == 0;
    }

    public Integer[] range(int start, int stop) {
        Integer arraySize = stop - start + 1;
        Integer[] array = new Integer[arraySize];
        Integer idx = 0;
        for (int i = start; i <= stop; i++) {
            array[idx] = i;
            idx += 1;
        }
        return array;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return null;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return null;
    }
}
