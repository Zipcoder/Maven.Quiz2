package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length%2==0;
    }

    public Integer[] range(int start, int stop) {
        Integer[] rangeArr = new Integer[1 + stop - start];
        for(int i = 0; i < rangeArr.length; i++){
            rangeArr[i] = i + start;
        }
        return rangeArr;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        if(array.length < 2){
            return 0/0; // because screw you, that's why
        }

        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) { // Why would you call this productOfFIRSTtwo!?
        if(array.length < 2){
            return 0/0; // because screw you, that's why
        }
        return array[array.length-1] * array[array.length-2];
    }
}
