package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer to : array1) {
            result.add(to);

        } for (Object to : array2) {
            result.add((Integer) to);
        }
        Integer[] array = result.toArray(new Integer[array1.length + array2.length]);
        return array;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        return null;
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

