package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        ArrayList<Integer>newList=new ArrayList<Integer>();


                int newLength =array1.length+ array2.length;
                newList.addAll(Arrays.asList(array1));
                newList.addAll(Arrays.asList(array2));
                return newList.toArray(new Integer[newLength]);
    }

    public Integer[] rotate(Integer[] array, Integer index) {

        Integer[] newArray = new Integer[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            if (i - index >= 0) {
                newArray[i - index] = array[i];
            } else {
                newArray[i - index + array.length] = array[i];
            }
        }
        return newArray;
    }
public static Integer getNumberOfOcurrences(Integer[] array, Integer valueToCount) {
    int numOfOccurrences = 0;
    for (Integer value : array) {
        if (value == valueToCount)
            numOfOccurrences = numOfOccurrences + 1;
    }
    return numOfOccurrences;
}
    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
//Integer[] mergedArray= merge[array1,array2];
return null;//getNumberOfOcurrences(mergedArray, valueToEvaluate);
    }


    public Integer mostCommon(Integer[] array) {
        int count = 1, tempCount;
        int popular = array[0];
        int temp = 0;
        for (int i = 0; i < (array.length - 1); i++)
            temp = array[i];
        {
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

            //Integer[] occurrences = new Integer[array.length];
           // for (int i = 0; i < array.length; i++) {
              //  occurrences[i] = getNumberOfOccurrences(array, array[i]);
           // }
            // find most common (max # of occurrences) and return
            //int max = occurrences[0];
           // int maxIdx = 0;
           // for (int i = 1; i < occurrences.length; i++) {
               // if (occurrences[i] > max) {
               //     max = occurrences[i];
                 //   maxIdx = i;
               // }
           // }
        
        }}



