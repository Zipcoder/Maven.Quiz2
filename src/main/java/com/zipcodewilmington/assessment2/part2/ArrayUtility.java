package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] newArray = new Integer[array1.length + array2.length];
        int index = 0;
        for(Integer x : array1){
            newArray [index] = x;
            index++;
        }
        for(Integer j : array2){
            newArray [index] = j;
            index++;
        }

        return newArray;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        Integer counter = 0;
        for (Integer x : array1) {
            if (x.equals(valueToEvaluate)) {
                counter++;
            }
        }
        for (Integer z : array2){
            if(z.equals(valueToEvaluate)){
                counter++;
            }
        }

        return counter;
    }
    public Integer mostCommon(Integer[] array) {
        Integer counter = 1, temp;
        Integer tempCount =0;
        Integer pop = array[0];
        for (int i = 0; i < array.length-1; i++){
            tempCount = array[i];
            temp = 0;
            for(int j = 1; j < array.length; j++){
                if (tempCount == array[j]) {
                    temp++;
                }
            }
            if (temp > counter){
                pop = tempCount;
                counter = temp;
            }
        }
        return pop;
    }

}
