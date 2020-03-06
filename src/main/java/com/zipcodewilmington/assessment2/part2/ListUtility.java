package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    List<Integer> list = new ArrayList<>();

    public Boolean add(int i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        return null;
    }

    public String join() {
        String result = "";
        for (int i = 0; i < list.size(); i++) {

            if (i == list.size() - 1)
                result += list.get(i).toString();
            else
                result += list.get(i).toString() + ", ";
        }
        return result;
    }

    public Integer mostCommon() {

//        Integer result = list.get(0);
//
////        Integer [] common = new Integer[list.size()];
////        for (int i = 0; i < list.size(); i++) {
////            common[i] = list.get(i);
////        }
////         result = ArrayUtility.mostCommon(common);
//
//        return result;

        return null;
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
