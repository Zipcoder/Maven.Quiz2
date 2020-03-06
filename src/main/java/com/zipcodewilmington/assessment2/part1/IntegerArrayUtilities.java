package com.zipcodewilmington.assessment2.part1;


public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length % 2 == 0;
    }


    public Integer[] range(int start, int stop) {

        int counter = 0;
        for (int i = start; i < stop; i++) {
            counter++;
        }

        Integer[] arr = new Integer[counter + 1];
        int counter2 = 0;
        for (int k = start; k <= stop; k++) {
            arr[counter2] = k;
            counter2++;
        }
        return arr;
    }


    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length - 1] * array[array.length - 2];
    }
}
