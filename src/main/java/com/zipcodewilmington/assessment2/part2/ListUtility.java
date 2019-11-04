package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class ListUtility {

    private ArrayList<Integer> list = new ArrayList<>();

    public Boolean add(Integer i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        Set<Integer> list2 = new HashSet<>(list);
        ArrayList<Integer> list3 = new ArrayList<>(list2);
        return list3;
    }

    public String join() {
        StringBuilder string = new StringBuilder(String.valueOf(list.get(0)));
        for(int i = 1; i < size(); i++) {
            string.append(", ").append(list.get(i));
        }
        return string.toString();
    }

    public Integer mostCommon() {
        Integer[] temp = new Integer[list.size()];
        ArrayUtility utility = new ArrayUtility();
        return utility.mostCommon(list.toArray(temp));
    }

    public Boolean contains(Integer valueToAdd) {
        return list.add(valueToAdd);
    }
}
