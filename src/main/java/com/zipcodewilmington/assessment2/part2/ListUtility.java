package com.zipcodewilmington.assessment2.part2;

import java.util.*;
import java.util.stream.Collectors;


public class ListUtility {
    List<Integer> newList = new ArrayList<>();

    public Boolean add(int i) {
        newList.add(i);

        return newList.size() != 0;
    }

    public Integer size() {
        return newList.size();
    }

    public List<Integer> getUnique() {
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer element : newList) {

            if (!result.contains(element)) {

                result.add(element);
            }
        }

        return result;
    }

    public String join() {

        String result = newList.stream().map(Object::toString)
                .collect(Collectors.joining(", "));

        return result;
    }

    public Integer mostCommon() {
        Map<Integer, Integer> result = new HashMap<>();

        for(int i=0; i< newList.size(); i++) {

            Integer frequency = result.get(newList.get(i));

            if(frequency == null) {
                result.put(newList.get(i), 1);
            } else {
                result.put(newList.get(i), frequency + 1);
            }
        }

        Integer mostCommonKey = 0;
        int maxValue = -1;
        for(Map.Entry<Integer, Integer> entry: result.entrySet()) {

            if(entry.getValue() > maxValue) {
                mostCommonKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }

        return mostCommonKey;
    }

    public Boolean contains(Integer valueToAdd) {

        if(newList.contains(valueToAdd))
            return true;

        return false;
    }
}
