package com.zipcodewilmington.assessment2.part2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    ArrayList<Integer> theList = new ArrayList<Integer>();

    public Boolean add(int i) {
        theList.add(i);
        return theList.contains(i);
    }

    public Integer size() {
        return this.size();
    }

    public List<Integer> getUnique() {
        ArrayList<Integer> resultList = new ArrayList<>();
        for(Integer num : this.theList){
           if (!resultList.contains(num))
           {resultList.add(num);}
        }
        return resultList;
    }

    public String join() {
        String result = "";
        result += theList.get(0);
        for (int i = 1; i < theList.size();i++){
            result += ", " + theList.get(i);
        }
        return result;
    }

    public Integer mostCommon() {
        Integer result=0;
        int counter = 0;
        int prevCounter = 0;
        for(Integer num : theList){
            prevCounter = counter;
            counter = 0;
            for (Integer currentNum :theList){
                if (currentNum == num){
                    counter++;
                }
                if (counter > prevCounter){
                    result = num;
                }
            }
        }
        return result;
    }

    public Boolean contains(Integer valueToAdd) {
        for (int i = 0;i<theList.size();i++){
            if (theList.get(i) == valueToAdd){
                return true;
            }
        }
        return false;
    }
}
