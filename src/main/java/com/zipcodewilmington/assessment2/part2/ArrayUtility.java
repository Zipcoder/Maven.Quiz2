package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] result = new Integer[array1.length + array2.length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);

        return result;

    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] front = new Integer[array.length - index];
        front = Arrays.copyOfRange(array, index, array.length);
        Integer[] moveBack = new Integer[index];
        moveBack=Arrays.copyOfRange(array, 0, index);
        Integer[] result = merge(front, moveBack);

        return result;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int counter = 0;
        Integer[] mergedArrays = new Integer[array1.length+array2.length];
        mergedArrays = merge(array1, array2);
        for (int i = 0; i < mergedArrays.length; i++){
            if (mergedArrays[i].equals(valueToEvaluate)){
                counter++;
            }
        }

        return counter;
    }

    public Integer mostCommon(Integer[] array) {
        Integer maxValue = 0;
        Integer maxCount = 0;

        Arrays.sort((array));

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; ++j) {
                if (array[j] == array[i])
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = array[i];
            }
        }

        return maxValue;
    }
}
