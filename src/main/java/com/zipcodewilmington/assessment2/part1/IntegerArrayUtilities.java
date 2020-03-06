package com.zipcodewilmington.assessment2.part1;

import sun.security.util.Length;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length % 2==0;
    }

    public Integer[] range(int start, int stop) {
        int arrayLength= stop-start+1;
        Integer[] result= new Integer[arrayLength];
        result[0]=start;
        for(int i=0; i<arrayLength;i++){
            start+=1;
            result[i]=start;
        }
        return result;

    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0]+ array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        int lastIdx = array.length -1;
        return array[lastIdx]* array[lastIdx -1];
    }
}
