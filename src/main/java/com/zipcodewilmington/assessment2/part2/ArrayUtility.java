package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {


    public Integer[] merge(Integer[] array1, Integer[] array2) {

        Integer[] newArr = new Integer[array1.length + array2.length];

        int indx = 0;
        for(Integer element : array1){
            newArr[indx] =  element;
            indx++;
        }

        for( Integer element : array2){
            newArr[indx] =  element;
            indx++;
        }
        return newArr;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] subArr1 = new Integer[index];

        for(int x = 0; x < index; x++){
            subArr1[x] =  array[x];
        }

        int indx = 0;
        Integer[] subArr2 = new Integer[array.length - index];
        for(int x = index; x <= array.length -1; x++){
            subArr2[indx] =  array[x];
            indx++;
        }


        return merge(subArr2 , subArr1);
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        Integer count = 0;
        for(Integer element : array1){
            if(element == valueToEvaluate){
                count++;
            }
        }
        for(Integer element : array2){
            if(element == valueToEvaluate){
                count++;
            }
        }

        return count;
    }

    public Integer mostCommon(Integer[] array) {

        Integer currentHighest = array[0];
        Integer highestCount = 0;

        if(array.length == 1){
            return array[0];
        }else{

            for(int x = 0; x<= array.length -1; x++){
                Integer countIn = 0;
                for(int z = 0; z <= array.length -1; z++){
                    if(array[x] == array[z]){
                        countIn ++;
                    }
                }
                if(countIn > highestCount){
                    currentHighest = array[x];
                    highestCount = countIn;
                }
            }

        }

        return currentHighest;
    }
}
