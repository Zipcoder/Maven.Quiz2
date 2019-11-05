package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListUtility {
    private List<Integer> list = new ArrayList<>();
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
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < list.size(); i++){
            stringBuilder.append(list.get(i));
            if(i != list.size()-1){
            stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString();
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {
        return null;
    }
}
