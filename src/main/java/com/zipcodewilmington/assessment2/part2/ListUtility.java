package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {

    private List<Integer> list = new ArrayList<>();

    public Boolean add(Integer i) {

        if(i == null){
            list.add(null);
        }
        list.add(i);
        return list.contains(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique(){

        List<Integer> newList = new ArrayList<>();
        for(Integer i : list){
        if (!newList.contains(i)){
            newList.add(i);
        }
    }
        return newList;
}

    public String join() {

        String c = list.get(0).toString();
        if( list.size() ==1) {
            return list.get(0).toString();
        }
        else
        for (int i = 1; i < list.size(); i++){
            c = c + ", " +list.get(i) ;
    }
        return c;
    }

    public Integer mostCommon() {

        Integer[] array = new Integer[list.size()];
        array = list.toArray(array);
        return ArrayUtility.mostCommon(array);
    }

    public Boolean contains(Integer valueToAdd) {
        return null;
    }
}
