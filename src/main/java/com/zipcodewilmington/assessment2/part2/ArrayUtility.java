package com.zipcodewilmington.assessment2.part2;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        List<Integer> merged = new ArrayList<>();

        for (int i=0; i<array1.length; i++){
            merged.add(array1[i]);
        }

        for (int i=0; i<array2.length; i++){
            merged.add(array2[i]);
        }

        Collections.sort(merged);
        Integer[] result=new Integer[merged.size()];
        for (int i=0; i<merged.size(); i++){
            result[i]=merged.get(i);
        }
        return result;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int n = 0;
        for(Object to : array1){
            if(to.equals(valueToEvaluate))
                n += 1;
        }

        return  n;
    }

    public Integer mostCommon(Integer[] array) {

        Arrays.sort(array);
        int max_count = 1, res = array[0];
        int curr_count = 1;

        for (int i = 1; i < array.length; i++)
        {
            if (array[i] == array[i - 1])
                curr_count++;
            else
            {
                if (curr_count > max_count)
                {
                    max_count = curr_count;
                    res = array[i - 1];
                }
                curr_count = 1;
            }
        }

        
        if (curr_count > max_count)
        {
            max_count = curr_count;
            res = array[array.length - 1];
        }

        return res;
    }
}
