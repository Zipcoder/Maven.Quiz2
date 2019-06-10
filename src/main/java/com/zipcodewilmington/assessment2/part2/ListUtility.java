package com.zipcodewilmington.assessment2.part2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {

    private List<Integer> theList;

    public ListUtility(){
        theList = new ArrayList<Integer>();
    }

    public Boolean add(Integer i) {

        return theList.add(i);
    }

    public Integer size() {
        return theList.size();
    }

    public List<Integer> getUnique() {
        List<Integer> uniqueList = new ArrayList<>();
        for(Integer integer : theList){
            if(!uniqueList.contains(integer)){
                uniqueList.add(integer);
            }
        }
        return uniqueList;
    }

    public String join() {
        if(theList.size()==0){return "";}

        StringBuilder sbuild = new StringBuilder(theList.get(0).toString());
        for(int i = 1; i < theList.size(); i++){
            sbuild.append(", ");
            sbuild.append(theList.get(i));
        }
        return sbuild.toString();
    }

    public Integer mostCommon() {
        ArrayUtility arrayUtility = new ArrayUtility();
        return arrayUtility.mostCommon(theList.toArray(new Integer[theList.size()]));
    }

    public Boolean contains(Integer valueToAdd) {
        return theList.contains(valueToAdd);
    }

}
