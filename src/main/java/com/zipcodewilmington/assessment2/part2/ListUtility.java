package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {

    private List<Integer> list = new ArrayList<>();

    public Boolean add(int i) {

//        if(i = null){
//            list.add(null);
//        }
        list.add(i);
        return this.contains(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        return null;
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
       // if (list.contains(null)) return null;
//        else
        return ArrayUtility.mostCommon(array);
    }

    public Boolean contains(Integer valueToAdd) {
        return null;
    }
}
