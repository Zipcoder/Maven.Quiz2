package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length % 2 == 0;
    }

    public Integer[] range(int start, int stop) {

        Integer length = Math.abs(start - stop) + 1;
        Integer counter = 0;

        Integer[] arr = new Integer[length];

        for(int i = start; i <= stop; i++) {
            arr[counter] = i;
            counter++;
        }
        return arr;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return null;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return null;
    }
}
