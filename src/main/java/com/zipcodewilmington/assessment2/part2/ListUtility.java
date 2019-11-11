package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListUtility {
    ArrayList<Integer> thisList = new ArrayList<>(0);

    public ListUtility(){
    }


    public Boolean add(int i) {
        thisList.add(i);
        return null;
    }

    public Integer size() {
        return thisList.size();
    }

    public List<Integer> getUnique() {
        Set<Integer> uniqueInts = new HashSet<Integer>(thisList);
        thisList = new ArrayList<>(uniqueInts);

        return thisList;
    }

    public String join() {
        ArrayList<String> newList = new ArrayList();

        for (Integer element : thisList){
            newList.add(element.toString());
        }
        String result = newList.toString();
        result = result.replace("[", "");
        result = result.replace("]", "");
        return result;
    }

    public Integer mostCommon() {

        return null;
    }

    public Boolean contains(Integer valueToAdd) {
        return thisList.contains(valueToAdd);
    }
}