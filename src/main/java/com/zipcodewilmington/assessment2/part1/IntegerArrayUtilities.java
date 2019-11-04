package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {

        return array.length % 2 == 0;
    }

    public Integer[] range(int start, int stop) {
        ArrayList<Integer> newRange = new ArrayList<>();
        Integer holdStart = start;

        if (start < 0){
        for (Integer i =0; i <= Math.abs(start - stop); i++){
            newRange.add(holdStart);
            holdStart++;
        }
        }else{
            for (Integer i =0; i <= Math.abs(stop - start); i++){
                newRange.add(holdStart);
                holdStart++;
            }

        }
        return newRange.toArray(new Integer[0]);
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length - 1] * array[array.length- 2];
    }
}
