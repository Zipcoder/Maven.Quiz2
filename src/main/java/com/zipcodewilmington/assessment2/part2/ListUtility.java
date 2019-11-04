package com.zipcodewilmington.assessment2.part2;

import java.util.*;

import static java.util.Objects.isNull;

public class ListUtility {
    private ArrayList<Integer> theList;

    public ListUtility() {
        this.theList = new ArrayList();
    }

    public Boolean add(int i) {
        theList.add(i);
        return theList.contains(i);
    }

    public Integer size() {
        return theList.size();
    }

    public List<Integer> getUnique() {
        Set set = new HashSet(theList);
        return new ArrayList(set);
    }

    public String join() {
        StringBuilder builder = new StringBuilder();
        builder.append(theList.get(0));
        for (int i = 1; i < theList.size(); i++) {
            builder.append(", " + theList.get(i));
        }
        return builder.toString();
    }

    public Integer mostCommon() {
        ArrayUtility arrayUtil = new ArrayUtility();
        return arrayUtil.mostCommon(theList.toArray(new Integer[theList.size()]));
    }

    public Boolean contains(Integer valueToAdd) {
        return theList.contains(valueToAdd);
    }
}
