package com.zipcodewilmington.assessment2.part2;


import java.util.*;



public class ListUtility {
    private ArrayList<Integer> list = new ArrayList<Integer>();

    public Boolean add(Integer i) {
        return list.add(i);

    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public String join() {
        StringBuilder sb = new StringBuilder(String.valueOf(list.get(0)));
        for (int i = 1; i < list.size(); i++) {
            sb.append(", ").append(list.get(i));
        }
        return sb.toString();
    }

    public Integer mostCommon() {
        Integer mostCommonInt = 0;
        Integer counter = 0;

        for (Integer i : list) {
            Integer currentCount = Collections.frequency(list, i);
            if(currentCount > counter) {
                mostCommonInt = i;
                counter = currentCount;
            }
        }

        return mostCommonInt;
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}




