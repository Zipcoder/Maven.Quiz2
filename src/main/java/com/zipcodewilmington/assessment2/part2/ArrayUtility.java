package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] result = new Integer[array1.length + array2.length];
        for(int i = 0; i < array1.length; i++){
            result[i] = array1[i];
        }
        for(int i = 0; i < array2.length; i++){
            result[i + array1.length] = array2[i];
        }
        return result;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] result = new Integer[array.length];
        for(int i = 0; i < array.length; i++){
            if(i + index >= array.length){
                result[i] = array[i + index - array.length];
            }
            else {
                result[i] = array[i + index];
            }
        }
        return result;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer[] combined = merge(array1,array2);
        Integer counter = 0;
        for(int i = 0; i < combined.length; i++){
            if(combined[i] == valueToEvaluate){
                counter++;
            }
        }
        return counter;
    }

    public Integer mostCommon(Integer[] array) {
        Integer current = array[0];
        for(int i = 0; i < array.length; i++){
            if(countOccurrence2(array, array[i]) > countOccurrence2(array,current)){
                    current = array[i];
            }
        }
        return current;
    }

    public Integer countOccurrence2(Integer[] array, Integer valueToEvaluate) {
        Integer counter = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == valueToEvaluate){
                counter++;
            }
        }
        return counter;
    }
}
