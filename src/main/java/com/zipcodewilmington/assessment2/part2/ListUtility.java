package com.zipcodewilmington.assessment2.part2;

import java.util.*;
import com.zipcodewilmington.assessment2.part2.ArrayUtility;

public class ListUtility {
    List<Integer> result = new ArrayList<Integer>();

    public Boolean add(int i) {
        result.add(i);
        return result.contains(i);
    }

    public Integer size() {
        return result.size();
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
        String joinedString = "";

        for (int i = 0; i < result.size(); i++){
            if (result.size() > 1 && i != result.size() - 1){
                joinedString += result.get(i) + ", ";
            } else {
                joinedString += result.get(i);
            }
        }
        return joinedString;
    }

    public Integer mostCommon() {
        ArrayUtility tempUtility = new ArrayUtility();
        Integer [] tempArray = new Integer[result.size()];
        result.toArray(tempArray);

        Integer counter = tempUtility.mostCommon(tempArray);

        return counter;
    }

    public Boolean contains(Integer valueToAdd) {
        return result.contains(valueToAdd);
    }
}
