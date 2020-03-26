package com.zipcodewilmington.assessment2.part1;

import sun.security.util.Length;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length % 2==0;
    }

    public Integer[] range(int start, int stop) {
        int size =Math.abs(stop - start)+1;

        Integer[] range= new Integer[size];
        for(int i=0; i<range.length;i++)
            range[i]=start+i;
        return range;


    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0]+ array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        int lastIdx = array.length -1;
        return array[lastIdx]* array[lastIdx -1];
    }
}
