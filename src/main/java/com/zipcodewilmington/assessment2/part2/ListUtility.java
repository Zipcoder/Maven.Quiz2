package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListUtility {
    private List<Integer> list;

    public ListUtility(){
        list = new ArrayList<>();
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
//        List<Integer> unique = new ArrayList<>();
////        for (Integer i: list){
////            if (!unique.contains(i)){
////                unique.add(i);
////            }
////        }
////
////        return list;
        Set<Integer> s = new HashSet<>(list);
        int n = s.size();
        List<Integer> aList = new ArrayList<>(n);
        aList.addAll(s);
        return aList;
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
