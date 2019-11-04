package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    ArrayList <Integer> theLists;

    public ListUtility() {
        theLists = new ArrayList<>(0);
    }

    public Boolean add(int i) {
        return theLists.add(i);
    }

    public Integer size() {
        return theLists.size();
    }

    public List<Integer> getUnique() {
        ArrayList<Integer> unique = new ArrayList<>();
        for (Integer i: theLists){
            if(!unique.contains(i)) {
                unique.add(i);
            }
        }
        return unique;
    }

    public String join() {
        if(theLists.size()==0){
            return ""; }

        StringBuilder sbuild = new StringBuilder(theLists.get(0).toString());
        for (int i = 1; i < theLists.size(); i++) {
             sbuild.append(", ");
             sbuild.append(theLists.get(i));
        }
        return sbuild.toString();
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {
        return theLists.contains(valueToAdd);
    }
}
