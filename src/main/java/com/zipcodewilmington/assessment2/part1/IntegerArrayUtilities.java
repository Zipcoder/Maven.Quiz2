package com.zipcodewilmington.assessment2.part1;

import java.util.Arrays;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public Integer[] range(int start, int stop) {
        Integer[] array = new Integer[]{};
        Integer[] copy2 = new Integer[]{};

        return  copy2 = Arrays.copyOfRange(array, start, stop);
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        Integer[] slice = Arrays.copyOfRange(array, array[0], array[1]);
        int sumOfFirstTwo = 0;
        for(int i = 0; i < slice.length; i++ ){
            sumOfFirstTwo+= i;
        }

        return sumOfFirstTwo;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        Integer[] slice = Arrays.copyOfRange(array, array[0], array[1]);
        int prodOfFirstTwo = 0;
        for(int i = 0; i < slice.length; i++){
            prodOfFirstTwo *= i;
        }
        return prodOfFirstTwo;
    }
}
