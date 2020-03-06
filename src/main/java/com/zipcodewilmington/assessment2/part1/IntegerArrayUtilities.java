package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length%2 == 0;
    }

    public Integer[] range(int start, int stop) {
        int off = 1;
        int n = stop - start;
        if(n < 0)
            off = -1;

        Integer[] result = new Integer[Math.abs(n)+1];
        int value = start;
        result[0] = start;
        for (int i = 1; i < Math.abs(n)+1 ; i++) {
            value = value + off;
            result[i] = value;
        }
        return result;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0]+array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length-2]*array[array.length-1];
    }
}
