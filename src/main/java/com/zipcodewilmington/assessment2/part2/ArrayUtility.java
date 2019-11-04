package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] array3 = new Integer[array1.length + array2.length];
        Integer counter = 0;

        for(int j = 0; j < array1.length; j++) {
            array3[j] = array1[j];
        }
        for(int i = array1.length; i < array3.length; i++) {
            array3[i] = array2[counter];
            counter++;
        }
        System.out.println(Arrays.toString(array3));

        return array3;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] temp1 = new Integer[index];
        Integer[] temp2 = new Integer[array.length - index];
        Integer counter = 0;

        for(int i = 0; i < array.length; i++) {
            if(i < index)
                temp1[i] = array[i];
            if(i >= index) {
                temp2[counter] = array[i];
                counter++;
            }
        }
        return merge(temp2, temp1);
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer[] array3 = merge(array1, array2);
        Integer counter = 0;

        for(int i = 0; i < array3.length; i++) {
            if(valueToEvaluate == array3[i])
                counter++;
        }
        return counter;
    }

    public Integer mostCommon(Integer[] array) {
        Integer counter;
        Integer temp = 0;
        Integer mostCommon = 0;

        for(int i = 0; i < array.length; i++) {
            counter = (countOccurrence(array, array, array[i])) / 2;

            if(temp < counter) {
                mostCommon = array[i];
                temp = counter;
            }

        }
        return mostCommon;
    }
}
