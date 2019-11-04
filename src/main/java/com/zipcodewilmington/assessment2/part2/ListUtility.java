package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class ListUtility {
    List<Integer> result = new ArrayList<Integer>();

    public Boolean add(int i) {
        boolean yesorno = false;

        result.add(i);
        yesorno = result.contains(i);
        return yesorno;
    }

    public Integer size() {
        return null;
    }

    public List<Integer> getUnique() {
        Integer [] tempArray = new Integer[result.size()];
        result.toArray(tempArray);
        Set<Integer> tempSet = new TreeSet<Integer>();

        for (int i = 0; i < tempArray.length; i++){
            tempSet.add(tempArray[i]);
        }

        result.clear();
        for (Integer x : tempSet){
            result.add(x);
        }

        return result;
    }

    public String join() {
        return null;
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {
        return null;
    }
}
