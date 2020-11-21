package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length % 2 == 0;
    }

    public Integer[] range(int start, int stop) {
        int length = stop - start + 1;
        Integer[] retArray = new Integer[length];
        for (int i = 0; i < length; i++, start++) {
            retArray[i] = start;
        }
        return retArray;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    //HAS TYPO IN NAME. PRODUCT OF LAST TWO NOT FIRST TWO
    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length-2] * array[array.length-1];
    }
}
