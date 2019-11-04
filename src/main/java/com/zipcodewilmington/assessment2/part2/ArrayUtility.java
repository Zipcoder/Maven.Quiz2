package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer aLen = array1.length;
        Integer bLen = array2.length;
        Integer[] result = new Integer[aLen + bLen];
        System.arraycopy(array1, 0, result, 0, aLen);
        System.arraycopy(array2, 0, result, aLen, bLen);
        return result;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] result = new Integer[array.length];
        for(int i = 0; i < array.length; i++){
            result[(i+(array.length-index)) % array.length ] = array[i];
        } return result;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer count = 0;
        for (Integer number : array1) {
            if (number == valueToEvaluate) {
                count++;
            }
        }
        for (Integer number : array2) {
            if (number == valueToEvaluate) {
                count++;
            }

        }  return count;
    }

    public Integer mostCommon(Integer[] array) {
        Integer[] arr = Arrays.copyOf(array, array.length, Integer[].class);
        int count = 1, tempCount;
        Integer popular = arr[0];
        int temp = 0;
        for (int i = 0; i < (arr.length - 1); i++)
        {
            temp = arr[i];
            tempCount = 0;
            for (int j = 1; j < arr.length; j++)
            {
                if (temp == arr[j])
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
