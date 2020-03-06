package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        Set<Integer> s = new HashSet<>(l);
        int n = s.size();
        List<Integer> aList = new ArrayList<>(n);
        for (Integer i : s)
            aList.add(i);
        return aList;
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
        ArrayUtility au = new ArrayUtility();
        return au.mostCommon(l.toArray(new Integer[0]));
    }

    public Boolean contains(Integer valueToAdd) {
        return l.contains(valueToAdd);
    }
}
