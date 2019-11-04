package com.zipcodewilmington.assessment2.part2;

import java.util.LinkedHashSet;
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
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public String join() {
        String result = "" + list.get(0);
        for(int i = 1; i < list.size();i++){
            result += ", " + list.get(i);
        }
        return result;
    }

    public Integer mostCommon() {
        Integer current = list.get(0);
        for(int i = 0; i < list.size(); i++){
            if(countOccurrence(list, list.get(i)) > countOccurrence(list,current)){
                current = list.get(i);
            }
        }
        return current;

    }

    public Integer countOccurrence(List<Integer>list, Integer valueToEvaluate) {
        Integer counter = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == valueToEvaluate){
                counter++;
            }
        }
        return counter;
    }

    public Boolean contains(Integer valueToAdd) {
        if(list.contains(valueToAdd)){
            return true;
        }
        return false;
    }
}
