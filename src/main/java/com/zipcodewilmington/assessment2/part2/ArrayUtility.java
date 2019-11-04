package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        return null;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return null;
    }

    public Integer mostCommon(Integer[] array) {
        // declare variables needed
        int counter =  0;
        int counterTemp = 0;
        Integer highest = 0;

        // inner loop checks for highest number before outer loop goes thru
        for (int i = 0 ; i <= array.length -1 ; i ++ ) {
            for (int j = 0; j <= array.length -1; j++) {
                if (array[i] == array[j]){
                    counterTemp++;
                }
                // after inner loop checks for MC num,
                if(counterTemp >= counter){
                    counter = counterTemp;
                    counterTemp = 0;
                    highest = array[i];
                }

            }
        }
        return highest;
    }
}
