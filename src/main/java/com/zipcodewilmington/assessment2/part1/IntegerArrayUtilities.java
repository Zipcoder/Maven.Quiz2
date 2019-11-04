package com.zipcodewilmington.assessment2.part1;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if (array.length % 2 == 0) {
            return true;
        }
        return false;
    }

    public Integer[] range(int start, int stop) {
//create new arr for values
        //loop new array
        //first index should be start, index+1 until <= stop
        //every index is positive plus 1

        Integer[] rangeArr = new Integer[stop - start + 1];
        int count = 1;
        rangeArr[0] = start;

        for (int i = 1; i < rangeArr.length; i++) {
            rangeArr[count] = start += 1;
            count++;

        }


        return rangeArr;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        Integer sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(array[0]) || array[i].equals(array[1])) {
                sum += array[i];
            }
        }
        return sum;
    }

    //last two
    public Integer getProductOfFirstTwo(Integer[] array) {


        List<Integer> newArr = Arrays.asList(array);
        Collections.reverse(newArr);
        Integer[] reversed = newArr.toArray(array);

        Integer sum = reversed[0] * reversed[1];

        return sum;
    }
}

