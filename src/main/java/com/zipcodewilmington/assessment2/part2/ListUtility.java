package com.zipcodewilmington.assessment2.part2;

import java.util.List;
import java.util.ArrayList;

public class ListUtility {

    List<Integer> list = new ArrayList<>();

    public Boolean add(int i) {

            return list.add(i);

    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        return null;
    }

    public String join() {
        return null;
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {
        if(list.contains(valueToAdd)){
            return true;
        }
        return false;
    }
}
