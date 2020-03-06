package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    private List<Integer> l;

    public ListUtility(){
        l  = new ArrayList<>();
    }

    public Boolean add(Integer i) {
        return l.add(i);

    }

    public Integer size() {
        return l.size();
    }

    public List<Integer> getUnique() {
        return null;
    }

    public String join() {
        StringBuilder s = new StringBuilder();
        for(Integer i:l){
            s.append(i).append(", ");
        }
        String result = s.toString().substring(0,s.toString().length()-2);
        return result;
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {
        return l.contains(valueToAdd);
    }
}
