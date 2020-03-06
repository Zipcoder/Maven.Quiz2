package com.zipcodewilmington.assessment2.part1;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;

public class IntegerArrayUtilities {

    public Boolean hasEvenLength(Integer[] array) {
        if(array.length %2 == 0){
            return true;
        }
        return false;
    }

    public Integer[] range(int start, int stop) {
        int count = 0;
        Integer[] range = new Integer[stop - start];
        for (int i = start; i <= stop ; i++) {

            range[count] = i;
            count++;
        }

        return range;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length -2] * array[array.length - 1];
    }
}
