package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return (array.length % 2 == 0);
    }

    public Integer[] range(int start, int stop) {
        Integer arrayLength = Math.abs(start - stop);
        Integer[] result = new Integer[arrayLength + 1];

        for(int i = 0; i <= arrayLength; i++)
        {
            result[i] = start + i;
        }

        return result;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return (array[0] + array[1]);
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return (array[0] * array[1]);
    }
}
