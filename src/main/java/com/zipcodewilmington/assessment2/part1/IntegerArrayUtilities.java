package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {

        return array.length % 2 == 0;
    }

    public Integer[] range(int start, int stop) {
        Integer arrayLength = stop - start + 1;
        int count = start;
        Integer[] newArray = new Integer[arrayLength];
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = count;
            count ++;
        }
        return newArray;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        int len = array.length;
        return array[len-1]*array[len-2];
    }
}
