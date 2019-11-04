package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    ArrayList<Integer> list = new ArrayList();

    public Boolean add(int i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for(Integer integer : list){
            if (!uniqueList.contains(integer)){
                uniqueList.add(integer);
            }
        }
        return uniqueList;
    }

    public String join() {
        String returnString = "" + list.get(0);
        for (int i = 1; i < list.size(); i++) {
            returnString += ", " + list.get(i);
        }
        return returnString;
    }

    public Integer mostCommon() {
        Integer[] array = new Integer[list.size()];
        ArrayUtility arrayUtility = new ArrayUtility();
        return arrayUtility.mostCommon(list.toArray(array));
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
