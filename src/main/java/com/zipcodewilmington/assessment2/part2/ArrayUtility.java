package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2)
    {
        Integer[] output = new Integer[array1.length + array2.length];

        for(Integer i = 0; i < array1.length; i++)
        {
            output[i] = array1[i];
        }
        for(Integer i = 0; i < array2.length; i++)
        {
            output[array1.length + i] = array2[i];
        }

        return output;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] result = new Integer[array.length];

        for(Integer i = 0; i < array.length; i++)
        {
            result[i] = array[(index + i) % array.length];
        }



        return result;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate)
    {
        Integer occurrences = 0;

        for(Integer i = 0; i < array1.length; i++)
        {
            if(array1[i] == valueToEvaluate)
            {
                occurrences++;
            }
        }
        for(Integer i = 0; i < array2.length; i++)
        {
            if(array2[i] == valueToEvaluate)
            {
                occurrences++;
            }
        }

        return occurrences;
    }

    public Integer mostCommon(Integer[] array)
    {
        Integer currentMostCommon = array[0];
        Integer currentMaxCount = 0;
        for(Integer i = 0; i < array.length; i++)
        {
            Integer appearances = 0;
            for(Integer k = 0; k < array.length; k++)
            {
                if(array[i] == array[k])
                {
                    appearances++;
                }
            }
            if(appearances > currentMaxCount)
            {
                currentMaxCount = appearances;
                currentMostCommon = array[i];
            }
        }

        return currentMostCommon;
    }
}