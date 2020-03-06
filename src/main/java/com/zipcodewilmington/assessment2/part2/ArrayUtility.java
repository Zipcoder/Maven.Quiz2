package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] toReturn = new Integer[array1.length + array2.length];
        int index = 0;
        for (Integer integer : array1) {
            toReturn[index] = integer;
            index++;
        }

        for (Integer integer : array2) {
            toReturn[index] = integer;
            index++;
        }
        return toReturn;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        /*Integer[] toReturn = new Integer[array.length];
        Integer[] temp = new Integer[index];
        int dex = 0;
        for (int i = 0; i < temp.length; i++) {
            temp[i] = array[i];
        }

        for (int i = 0; i < ; i++) {
            
        }

        return merge(temp, array);*/
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return null;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
