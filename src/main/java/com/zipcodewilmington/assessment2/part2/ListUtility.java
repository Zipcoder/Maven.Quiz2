package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListUtility {

    List<Integer> list = new ArrayList<>();

    public Boolean add(Integer i) {

        if(i == null){
            list.add(null);
        }

        list.add(i);
        return this.list.contains(i);

    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {

        List<Integer> newList = new ArrayList<>();

        // Streams only distinct values by using Object :: equals method
        newList = list.stream().distinct().collect(Collectors.toList());

        return newList;
    }

    public String join() {
        String str = "";
        for(int i = 0; i < list.size() - 1; i++){
            str = str + list.get(i) + ", ";
        }
        str = str + list.get(list.size() - 1);

        return str;
    }



    public Integer mostCommon() {
        ArrayUtility arrayUtility = new ArrayUtility();
        Integer[] array = new Integer[list.size()];
        array = list.toArray(array);
        return arrayUtility.mostCommon(array);
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
