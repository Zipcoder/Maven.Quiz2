package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    List<Integer> myList = new ArrayList<>();

    public Boolean add(int i) {
        int sizeBefore = myList.size();
        Integer newVal = i;
            myList.add(newVal);
        int sizeAfter = myList.size();
        if(sizeBefore < sizeAfter){
            return true;
        }
        return false;
    }

    public Integer size() {
        return myList.size();
    }

    public List<Integer> getUnique() {
        List<Integer> newList = new ArrayList<>();

        for (Integer i :myList) {
            if(!newList.contains(i)){
                newList.add(i);
            }
        }
        return newList;
    }

    public String join() {
        String result = "";
        if(myList.size() == 1){
            for (Integer i : myList) {
                result += i;
            }
        } else if(myList.size() > 1){
            for (int i = 0; i < myList.size()-1; i++) {
                result += myList.get(i);
                result+=", ";
            }
            result += myList.get(myList.size()-1);
        }

        return result;
    }

    public Integer mostCommon() {
        ArrayUtility k = new ArrayUtility();
        Integer[] array = new Integer[myList.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = myList.get(i);
        }
        Integer result = k.mostCommon(array);
        return result;
    }

    public Boolean contains(Integer valueToAdd) {
        return myList.contains(valueToAdd);
    }
}
