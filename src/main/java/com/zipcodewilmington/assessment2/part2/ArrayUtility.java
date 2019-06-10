package com.zipcodewilmington.assessment2.part2;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(array1));
        arrList.addAll(Arrays.asList(array2));
        return arrList.toArray(new Integer[arrList.size()]);
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        // not a good way. come back if time
        Queue<Integer> quoQue = new ArrayBlockingQueue<Integer>(array.length);
        for(Integer integer : array){
            quoQue.add(integer);
        }
        for(int i = 0; i < index; i++){
            Integer temp = quoQue.poll();
            quoQue.add(temp);
        }
        return quoQue.toArray(new Integer[quoQue.size()]);
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer baron = 0;
        for(Integer integer : array1){
            if(integer.equals(valueToEvaluate)){
                baron++;
            }
        }
        for(Integer integer : array2){
            if(integer.equals(valueToEvaluate)){
                baron++;
            }
        }
        return baron;
    }

    public Integer mostCommon(Integer[] array) {
        // try hashmap wizardry if time
        ArrayList<Integer> keys = new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();

        for(Integer integer : array){
            if(keys.contains(integer)){
                values.set(keys.indexOf(integer),values.get(keys.indexOf(integer))+1);
            }
            else {
                keys.add(integer);
                values.add(1);
            }
        }

        Integer largestKey = -1;
        Integer largestValue = -1;

        for(int i = 0; i < values.size(); i++){
            if(values.get(i) > largestValue){
                largestKey = keys.get(i);
                largestValue = values.get(i);
            }
        }
        return largestKey;
    }
}
