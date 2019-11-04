package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        Integer[] newArr = new Integer[array1.length + array2.length];

        System.arraycopy(array1, 0, newArr, 0, array1.length);
        System.arraycopy(array2, 0, newArr, array1.length, array2.length);

        Integer[] resultArr = new Integer[ array1.length + array2.length ];

        for(int i = 0; i < newArr.length; i++) {
            resultArr[i] = newArr[i];
        }

        return resultArr;
    }
//not done
    public Integer[] rotate(Integer[] array, Integer index) {


        List<Integer> intList = new ArrayList<>(array.length);
        for (int i : array)
        {
            intList.add(i);
        }

        Collections.rotate(intList, index-1);

        Integer[] newArr = new Integer[intList.size()];
        for (int i=0; i < newArr.length; i++)
        {
            newArr[i] = intList.get(i).intValue();
        }
        return newArr;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == valueToEvaluate) {
                count++;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == valueToEvaluate) {
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
