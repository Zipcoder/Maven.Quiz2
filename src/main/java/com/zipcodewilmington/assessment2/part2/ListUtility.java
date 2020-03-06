package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListUtility {
    List list = new ArrayList();
    public Boolean add(int i) {
        list.add(i);
        return list.contains(i);
    }

    public Integer size() {

        return this.list.size();
    }

    public List<Integer> getUnique() {
        Set<Integer> uniqueList = new HashSet<Integer>(this.list);
        return (List<Integer>)uniqueList;
    }

    public String join() {
        return null;
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {

        return this.list.contains(valueToAdd);
    }
}
