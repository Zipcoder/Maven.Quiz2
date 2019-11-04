package com.zipcodewilmington.assessment2.part2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        List<Integer> mergeArray = new ArrayList<>(Arrays.asList(array1));
        mergeArray.addAll(Arrays.asList(array2));
        Integer[] mergeFinal = new Integer[mergeArray.size()];
        return mergeArray.toArray(mergeFinal);
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] firstArray = Arrays.copyOfRange(array,0,  index);
        Integer[] secondArray = Arrays.copyOfRange(array, index, array.length);
        Integer[] newArray = (merge(secondArray, firstArray));
        return newArray;
    }

     public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
       Integer occurInArray1 = Collections.frequency(Arrays.asList(array1), valueToEvaluate);
        Integer occurInArray2 = Collections.frequency(Arrays.asList(array2),valueToEvaluate);
        return occurInArray1 + occurInArray2;
    }

    public static Integer mostCommon(Integer[] array) {
        Integer occur = null;
        Integer most = null;

        for(int i =0; i< array.length; i++){
            Integer frequent = Collections.frequency(Arrays.asList(array),array[i]);
            if(occur == null || occur < frequent);
            occur = frequent;
            most = array[i];

        }

        return most;
    }


    }

