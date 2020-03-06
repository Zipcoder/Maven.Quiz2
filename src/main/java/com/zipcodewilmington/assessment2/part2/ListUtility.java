package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class ListUtility {

    private ArrayList<Integer> list;

    public ListUtility() {
        list = new ArrayList<>();
    }


    public Boolean add(Integer i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        Set<Integer> set = new HashSet<>();
        for (Integer i : list) {
            set.add(i);
        }
        List<Integer> toRet = new ArrayList<>();
        toRet.addAll(set);
        return toRet;
    }

    public String join() {
        String toRet = "";
        for (Integer i : list) {
            toRet += i + ", ";
        }
        return toRet.substring(0, toRet.length() -2);
    }

    public Integer mostCommon() {
        if (list.size() < 1) {
            throw new IllegalArgumentException("Cannot find most common element of empty list!");
        }
        Map<Integer, Integer> occ = new HashMap<>();
        for (Integer i : list) {
            if (occ.containsKey(i)) {
                occ.put(i, occ.get(i) + 1);
            } else {
                occ.put(i, 1);
            }
        }

        Integer highest = 0;
        Integer num = list.get(0);
        for (Map.Entry<Integer, Integer> i : occ.entrySet()) {
            if (i.getValue() > highest) {
                num = i.getKey();
                highest = i.getValue();
            }
        }
        return num;
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
