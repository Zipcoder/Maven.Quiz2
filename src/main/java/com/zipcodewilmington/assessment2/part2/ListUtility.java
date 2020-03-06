package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

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
        List<Integer> retList = new ArrayList<>();
        retList.add(list.get(0));
        for(Integer e : list){
            if(!retList.contains(e))
                retList.add(e);
        }
        return retList;
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

    //NULL ERROR
    public Integer mostCommon() {
        int maxCount = 0;
        Integer retInt = 0;
        for (int i = 0; i < list.size(); i++) {
            int count = 1;
            for (int j = 1; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j)))
                    count++;
            }
            if(count > maxCount){
                retInt = list.get(i);
                maxCount = count;
            }
        }
        return retInt;
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
