package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {

        return array.length % 2 == 0;
    }

    public Integer[] range(int start, int stop) {
        Integer[] testArray = new Integer[stop - start + 1];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = start;
            start++;
        }
        return testArray;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return null;
    }
}
