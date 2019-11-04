package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        Integer counter = 0;
        for (Integer i : array1){
            counter++;}
        for (Integer i : array2){
            counter++;
        }


        Integer[] completeArray = new Integer[counter];
        Integer secondCounter = 0;
        for (Integer i : array1){
            completeArray[secondCounter] = i;
            secondCounter++;
        }
        for (Integer i : array2){
            completeArray[secondCounter] = i;
            secondCounter++;
        }
        return completeArray;

    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] indexToRotate = new Integer[array.length];
        Integer counter = 0;
        for (int i = index; i < indexToRotate.length; i++) {
            indexToRotate[counter] = array[i];
            counter++;
        }
        for (int i = counter; i < indexToRotate.length; i++){
            indexToRotate[i] = array[index - 1];
            counter++;
        }
        return indexToRotate;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int counter = 0;
        for (Integer s : array1){
            if (s == valueToEvaluate){
                counter++;
            }
        }
        for (Integer s : array2){
            if (s == valueToEvaluate){
                counter++;
            }
        }
        return counter;


    }

    public Integer mostCommon(Integer[] array) {
        Integer[] repeatingNums = {0,0,0,0,0,0,0,0,0,0,0};
        int index = 0;
        for (Integer i: array){
            for (Integer j : array){
                if (j==i){
                    repeatingNums[index]++;
                }
            }
            index++;
        }
        Integer mostCommon = 0;
        for (int i = 0; i < repeatingNums.length - 1; i++){
            if (repeatingNums[i] > repeatingNums[i+1]) {
                mostCommon = array[i];
            }
        }

        return mostCommon;

    }
}
