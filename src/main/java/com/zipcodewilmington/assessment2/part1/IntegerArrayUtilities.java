package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if (array.length % 2 == 0){
            return true;
        }
        else return false;
    }

    public Integer[] range(int start, int stop) {
        Integer[] newArr = new Integer[stop - start + 1];
        for (int i = 0; i < newArr.length ; i++) {
            newArr[i] = start;
            start++;
        }
        return newArr;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        Integer sum = array[0] + array[1];
        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        Integer sum = array[array.length - 1] * array[array.length-2];
        return sum;
    }
}
