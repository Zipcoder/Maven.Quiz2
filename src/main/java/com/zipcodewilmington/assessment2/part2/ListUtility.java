package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    List<Integer> list = new ArrayList<>(); {
    }
    public Boolean add(int i) {
        if (list.add(i)){
            return true;
        }
        return false;
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        List<Integer> unique = new ArrayList<>();
        for (Integer i: list){
            if (!unique.contains(i)){
                unique.add(i);
            }
        }

        return list;
    }

    public String join() {
        String blah = "";
        for (Integer i: list){
            if (list.size()==1){
                return i.toString();
            }
            blah += i + ", ";
        }
        return blah.substring(0, blah.length() - 2);
    }

    public Integer mostCommon() {
        ArrayUtility util = new ArrayUtility();
        Integer[] result = new Integer[list.size()];
        result = list.toArray(result);
        return util.mostCommon(result);
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
