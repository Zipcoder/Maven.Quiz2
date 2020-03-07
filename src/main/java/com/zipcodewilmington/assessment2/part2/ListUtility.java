package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListUtility {

    List<Integer> list;

    public ListUtility() {
        this.list = new ArrayList<>();
    }


    public Boolean add(Integer i) { return list.add(i); }


    public Integer size() { return list.size(); }


    public List<Integer> getUnique() {
        List<Integer> list2 = new ArrayList<>();
        for (Integer inter : list2) {
            list2.add(inter);
        }
        return null;
    }


    public String join() {
        Integer[] result = new Integer[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return Arrays.toString(result).replaceAll("\\[|]|", "");
    }


    public Integer mostCommon() {

        ArrayUtility arrayUtility = new ArrayUtility();
        Integer[] result = new Integer[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return arrayUtility.mostCommon(result);
    }


    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
