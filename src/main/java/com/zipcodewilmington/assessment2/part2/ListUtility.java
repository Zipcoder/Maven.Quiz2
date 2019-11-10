package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;
import org.jooq.lambda.Seq;
//import org.apache.commons.stat.StatUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListUtility{
    private ArrayList<Integer> myArray;

    //constructor for ListUtility class
    public ListUtility(){
        this.myArray = new ArrayList<Integer>();
}

    public Boolean add(Integer i) {

       this.myArray.add(i);  //needs to use the contains method provided in the class at the bottom.
        return true;

    }

    public Integer size() {
        return this.myArray.size();
    }

    public List<Integer> getUnique() {
        //Set<Integer> uniqueInts = new HashSet<Integer>(myArray);

        List<Integer> listUnique = myArray.stream().distinct().collect(Collectors.toList());
        return listUnique;
    }

    public String join() {
        String myArrayAsString = myArray.toString();
        myArrayAsString.split(", ");
        return myArrayAsString.substring(1, myArrayAsString.length()-1);

    }

    public Integer mostCommon() {
        Integer mode = myArray.get(0);
        Integer maxCount = 0;
        for (int i = 0; i < myArray.size(); i++) {
            Integer value = myArray.get(i);
            int count = 1;
            for (int j = 0; j < myArray.size(); j++) {
                if (myArray.get(j) == value) count++;
                if (count > maxCount) {
                    mode = value;
                    maxCount = count;
                }
            }
        }
        return mode;
    }

    public Boolean contains(Integer valueToAdd) {
        return this.myArray.contains(valueToAdd);
    }
}
