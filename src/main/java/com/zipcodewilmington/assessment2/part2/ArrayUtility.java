package com.zipcodewilmington.assessment2.part2;

import org.omg.CORBA.INTERNAL;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(array1));
        arrList.addAll(Arrays.asList(array2));
        return arrList.toArray(new Integer[arrList.size()]);
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        // not a good way. come back if time
        // maybe it is a good way? Queue does exactly what I need
        /*
        Queue<Integer> quoque = new ArrayBlockingQueue<>(array.length);
        for(Integer integer : array){
            quoque.add(integer);
        }
        */
        Queue<Integer> quoque = new LinkedList<Integer>(Arrays.asList(array));
        for(int i = 0; i < index; i++){
            Integer temp = quoque.poll();
            quoque.add(temp);
        }
        return quoque.toArray(new Integer[quoque.size()]);
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
        /*
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
        return largestKey; */
        Map<Integer, Integer> map = new HashMap<>();

        for(Integer integer : array){
            map.merge(integer, 1, (v1, v2) -> v1 + v2);
        }
        Integer largestKey = Integer.MAX_VALUE;
        Integer largestValue = -1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > largestValue){
                largestKey = entry.getKey();
                largestValue = entry.getValue();
            }
        }
        return largestKey;
    }
}
