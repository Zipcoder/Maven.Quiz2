package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] newArr = new Integer[array1.length + array2.length];
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            newArr[i] = array1[i];
            count++;
        }

        for (int j = 0; j < array2.length; j++) {
            newArr[count++] = array2[j];
        }

        return newArr;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        for (int i = 0; i < index; i++) {
            int j;
            int first;
            first = array[0];

            for(j = 0; j < array.length -1; j++) {
                array[j] = array[j+1];
            }

            array[j] = first;
        }

        return array;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int count1 = 0;
        int count2 = 0;
        int total = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == valueToEvaluate)
                count1++;
        }

        for (int j = 0; j < array2.length; j++) {
            if (array2[j] == valueToEvaluate)
                count2++;
        }

        total = count1 + count2;
        return total;

    }

    public Integer mostCommon(Integer[] array) {
        int count = 1;
        int tempCount;
        int popular = array[0];
        int temp = 0;
        for (int i = 0; i < (array.length - 1); i++) {
            temp = array[i];
            tempCount = 0;
            for (int j = 1; j < array.length; j++) {
                if (temp == array[j])
                    tempCount++;
            }
            if (tempCount > count) {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;
    }
}
