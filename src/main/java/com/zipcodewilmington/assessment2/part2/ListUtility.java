package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class ListUtility {

    List<Integer> list = new ArrayList<>();

    public Boolean add(int i) {
       return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public String join() {
        String result = "" + list.get(0);
        for (int i = 1; i<list.size(); i++) {
            result += ", " + list.get(i);
        }

        return result;
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {

        return list.contains(valueToAdd);
    }
}
