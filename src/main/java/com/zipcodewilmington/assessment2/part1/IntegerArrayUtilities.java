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
        Integer sum = 0;
        if (array.length >= 2) {
            sum = array[0] + array[1];
        }
        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        // getProductOfLastTwo
        Integer product = 1;
        if (array.length >= 2) {
            product = array[array.length-1] * array[array.length-2];
        }
        return product;
    }
}
