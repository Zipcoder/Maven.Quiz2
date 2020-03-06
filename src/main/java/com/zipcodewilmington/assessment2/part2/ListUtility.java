package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    private List<Integer> list = new ArrayList();

    public Boolean add(int i) {
        Integer z =i;
        if (z != null){
        this.list.add(z);
        return true;
        }
        else return false;
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        List<Integer> uniques = new ArrayList<>();
        for (int i = 0; i < list.size() ; i++) {
            for (int j = i+1; j < list.size() ; j++) {
                if(list.get(i) != list.get(j)){
                    uniques.set(i, list.get(i));
                }
            }
        }
        return uniques;
    }

    public String join() {
        String string = "";
        string += list.toString();
        string.replace("[","" );
        string.replace("]", "");
        return string;
    }

    public Integer mostCommon() {
        Integer mostOcc = 0;
        Integer currCount = 0;
        Integer occMost =0;
        for (int i = 0; i <list.size() ; i++) {
            for (int j = i; j < list.size() ; j++) {
                if (list.get(i) == list.get(j)){
                    currCount++;
                }}
            if(currCount > mostOcc){
                mostOcc = currCount;
                occMost = list.get(i);}
            currCount = 0;

        }
        return occMost;
    }

    public Boolean contains(Integer valueToAdd) {
        if(valueToAdd != null){
            return list.contains(valueToAdd);
        }

       else return null;
    }
}
