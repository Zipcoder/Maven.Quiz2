package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length % 2 == 0;
    }

    public Integer[] range(int start, int stop) {
        int length = stop - start +1;
        Integer[] newArr = new Integer[length];
        newArr[0] = start;
        for (int i = 1; i < length; i++) {
            newArr[i] = newArr[i-1] + 1;
        }

        return newArr;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length-1] * array[array.length-2];
    }
}
