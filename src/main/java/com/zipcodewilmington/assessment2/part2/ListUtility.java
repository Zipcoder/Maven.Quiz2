package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {

    List<Integer> list = new ArrayList<>();

    public Boolean add(int i) {
        list.add(i);
        if (list.contains(i)) {
            return true;
        } else
            return false;
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
/*        List<Integer> toReturn = new ArrayList<>();
        Integer lastSeen = 0;
        for (Integer element : list) {
            lastSeen = element;
            for (Integer index : list) {
                if ()
            }
        }*/
        return null;
    }

    public String join() {
        return null;
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {
        if (list.contains(valueToAdd)) {
            return true;
        } else
        return false;
    }
}
