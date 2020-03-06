package com.zipcodewilmington.assessment2.part2;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class ListUtility {
    private List<Integer> list = new ArrayList<>();
    public Boolean add(int i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        return new ArrayList<>(new HashSet<>(list));
    }

    public String join() {
        String result = list.toString();
        return result.substring(1, result.length()-1);
    }


    public Integer mostCommon() {
        ArrayUtility arrayUtility = new ArrayUtility();
        return arrayUtility.mostCommon(list.toArray(new Integer[0]));
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
