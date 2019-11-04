package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        ArrayList<Integer> myList = new ArrayList(Arrays.asList(array1));
        myList.addAll(Arrays.asList(array2));

        Integer[] result = myList.toArray(new Integer[0]);

        return result;
    }

    public Integer[] rotate(Integer[] array, Integer index) {

        ArrayList<Integer>  myList = new ArrayList(Arrays.asList(array));

        Collections.rotate(Arrays.asList(array), index * -1);

        return array;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        ArrayList<Integer> myList = new ArrayList(Arrays.asList(array1));
        myList.addAll(Arrays.asList(array2));

        int result = Collections.frequency(myList, valueToEvaluate);

        return result;
    }

    public Integer mostCommon(Integer[] array) {
        ArrayList<Integer>  myList = new ArrayList(Arrays.asList(array));
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i< myList.size(); i++) {

            Integer frequency = map.get(myList.get(i));
            if(frequency == null) {
                map.put(myList.get(i), 1);
            } else {
                map.put(myList.get(i), frequency + 1);
            }
        }

        Integer mostCommonKey = 0;
        int maxValue = -1;

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {

            if(entry.getValue() > maxValue) {
                mostCommonKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }

       return mostCommonKey;
    }
}
