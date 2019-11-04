package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if (array.length % 2 ==0) {
            return true;
        } else {
            return false;
        }
    }

    public Integer[] range(int start, int stop) {



        int arrayLength = (stop - start) + 1;
            if ( arrayLength < 0){
                arrayLength = arrayLength * (-1);
                arrayLength += 1;
            }
        Integer[] theRange = new Integer [arrayLength];
        //ArrayList<Integer> myRange = new ArrayList<>();

        for (int i = 0; i <=stop; i++) {
            theRange[i] = start + i;
        }
            return theRange;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array [1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        int lastNumIndex = array.length - 1;
        return array[lastNumIndex] * array [lastNumIndex - 1];

    }
}
