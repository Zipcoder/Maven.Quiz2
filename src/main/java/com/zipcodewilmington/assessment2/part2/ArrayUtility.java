package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        int len = array1.length + array2.length;
        int counter = 0;
        Integer[] newArray = new Integer[len];
        for(int i = 0; i < array1.length; i++){
            newArray[i] = array1[i];
        }
        for(int i = array1.length; i < newArray.length; i ++){
            newArray[i] = array2[counter];
            counter++;
        }

        return newArray;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        int len = array.length;
        Integer[] newArray = new Integer[len];
        for(int i = 0; i < array.length; i++){
            if(i == 0){
                newArray[i] = array[i+1];
            }

        }

        return newArray;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int count = 0;
        for(int i = 0; i < array1.length; i++){
            if(array1[i] == valueToEvaluate){
                count ++;
            }
        }
        for(int i = 0; i < array2.length; i++){
            if(array2[i] == valueToEvaluate){
                count++;
            }
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        int count = 0;
        int temp = 0;
        int mostCommon = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array.length; j++){
                if(array[0].equals(array[j])){
                    count++;

                }


            }
        }
        return null;
    }
}
