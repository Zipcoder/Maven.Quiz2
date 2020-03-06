package com.zipcodewilmington.assessment2.part2;


import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] answer = new Integer[array1.length + array2.length];
        int counter = 0;
        for (int i = 0; i <array1.length ; i++) {
            answer[i] = array1[i];
            counter++;
        }
        for (int i = 0; i <array2.length ; i++) {
            answer[counter] = array2[i];
            counter++;
        }
        return answer;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] answer = new Integer[array.length];
        Integer[] preFlip;
        Integer[] postFlip;
       preFlip =  Arrays.copyOfRange(array,0,index);
       postFlip= Arrays.copyOfRange(array,index,array.length);

        answer = merge(postFlip,preFlip);
        return answer;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int counter = 0;
        for (int i = 0; i <array1.length ; i++) {
            if(array1[i].equals(valueToEvaluate)){
                counter++;
            }

        }
        for (int i = 0; i <array2.length ; i++) {
            if(array2[i].equals(valueToEvaluate)){
                counter++;
            }


        }

        return counter;
    }

    public Integer mostCommon(Integer[] array) {
        Integer answer=-1;
        Integer counter = 0;
        Integer countAgainst =0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array.length ; j++) {
                if(array[i].equals(array[j])){
                    counter++;
                    if(counter>countAgainst){
                        answer = array[j];
                    }
                }

            }
            counter=0;
        }


        return answer;
    }
}
