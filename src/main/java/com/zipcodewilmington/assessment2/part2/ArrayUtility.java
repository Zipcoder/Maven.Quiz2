package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] result = new Integer[array1.length + array2.length];
        for(int i = 0; i < array1.length; i++){
            result[i] = (Integer)array1[i];
        }
        for(int i = 0; i < array2.length; i++){
            result[array1.length + i] = (Integer)array2[i];
        }
        return result;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        int temp;
        for (int i = 0; i < index; i++)
        {
            temp = array[0];

            for (int j = 0; j < array.length-1; j++)
            {
                array[j] = array[j+1];
            }

            array[array.length-1] = temp;
        }
        return array;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int count = 0;

        for(int i = 0; i < array1.length; i++) {
            if(array1[i].equals(valueToEvaluate)){
                count++;
            }
        }
        for(int j = 0; j < array2.length; j++){
            if(array2[j].equals(valueToEvaluate)){
                count++;
            }
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        int count = 1, tempCount;
        int popular = array[0];
        int temp = 0;
        for (int i = 0; i < (array.length - 1); i++)
        {
            temp = array[i];
            tempCount = 0;
            for (int j = 1; j < array.length; j++)
            {
                if (temp == array[j])
                    tempCount++;
            }
            if (tempCount > count)
            {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;
    }
}
