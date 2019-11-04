package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return null;
    }

    public Integer[] range(int start, int stop) {
        return null;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return null;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        int lastNumber = 0;
        int secondToLastNumber = 0;

        lastNumber = array[array.length - 1];
        secondToLastNumber = array[array.length - 2];
        return lastNumber * secondToLastNumber;
    }
}
