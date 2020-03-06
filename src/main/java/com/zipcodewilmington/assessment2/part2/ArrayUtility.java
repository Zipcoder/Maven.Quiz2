package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] result = new Integer[array1.length + array2.length];
        int pos = 0;
        for (int element : array1) {
            result[pos] = element;
            pos++;
        }

        for (int element : array2) {
            result[pos] = element;
            pos++;
        }
        return result;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] result = new Integer[array.length];
        for(int x = 0; x < array.length; x++){
            result[(x+index) % array.length ] = array[x];
        }
        return result;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer count1 = 0;
        Integer count2 = 0;

        for (int i : array1) {
            if (i == valueToEvaluate) {
                count1 += 1;
            }
        }
        for (int i : array2) {
            if (i == valueToEvaluate) {
                count2 += 1;
            }
        }
        return count1 + count2;

    }

    public Integer mostCommon(Integer[] array){
        int count = 1, tempCount;
        int popular = array[0];
        int temp;
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
