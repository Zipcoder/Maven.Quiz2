package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if(array.length % 2 == 0){
            return true;
        }
        return false;
    }

    public Integer[] range(int start, int stop) {
        Integer[] array = new Integer[Math.abs(stop - start)+1];
        for(int i = start; i <= stop; i++){
            array[i-start] = i;
        }
        return array;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length - 1] * array[array.length -2];
    }
}
