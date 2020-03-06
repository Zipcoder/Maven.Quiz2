package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length%2==0;
    }

    public Integer[] range(int start, int stop) {
        int size = stop - start;
        if (size < 0) { size = -size; }
        Integer[] newArr = new Integer[size + 1];
        for (int i = start, iter = 0; i <= stop; i++, iter++) {
            newArr[iter] = i;
        }
        return newArr;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfLastTwo(Integer[] array) {
        return array[array.length - 2] * array[array.length - 1];
    }
}
