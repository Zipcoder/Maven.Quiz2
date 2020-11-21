package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListUtility {

    List<Integer> list = new ArrayList<>();

    //CHANGED INT TO INTEGER TO ACCEPT NULL
    public Boolean add(Integer i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        Set<Integer> retSet = new LinkedHashSet<>();
        for(Integer e : list){
            retSet.add(e);
        }
        return new ArrayList<>(retSet);
    }

    public String join() {
        StringBuilder retString = new StringBuilder();
        for(Integer e : list){
            if(list.indexOf(e) != 0)
                retString.append(", " + e);
            else
                retString.append(e + "");
        }
        return retString.toString();
    }

    public Integer mostCommon(){
        ArrayUtility au = new ArrayUtility();
        return au.mostCommon(list.toArray(new Integer[0]));
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
