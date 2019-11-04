package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.*;

public class ListUtility{
    public ArrayList<Integer> myArray = new ArrayList<Integer>(){
        {
            add(1);
            add(2);
            add(3);
            //add(null);
        }
    };
    //public ListUtility myUtil = new ListUtility();


    public Boolean add(int i) {
        //ArrayList<Integer> myArray = new ArrayList<>();
//        return myArray.add(i);
//        System.out.println(myArray.toString());

        return myArray.contains(i);

    }

    public Integer size() {

        //return Collection.size();
        return 0;
    }

    public List<Integer> getUnique() {


        return null;
    }

    public String join() {
        return null;
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {
        return null;
    }
}
