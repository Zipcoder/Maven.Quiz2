package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Objects.isNull;
import  com.zipcodewilmington.assessment2.part2.ArrayUtility;

public class ListUtility {
    ArrayList<Integer> al = new ArrayList<Integer>();


    public Boolean add(int i) {
            if (al.add(i)) return true; else return false;
    }

    public Integer size() {
        return al.size();
    }

    public List<Integer> getUnique()
    {

        List<Integer> uniquelist = new ArrayList<>();
        for (int i = 0; i < al.size(); i++) {
            if (!uniquelist.contains(al.get(i))) {
                uniquelist.add(al.get(i));
            }
        }
        return uniquelist;
    }

    public String join() {
        StringBuilder output = new StringBuilder();

        for (int i=0; i< al.size(); i++) {
            output.append(al.get(i));
            if (i != al.size()-1) {
                output.append(", ");
            }
        }
        return output.toString();
    }

    //added by usha
    public static Integer[] castingMethodtoInteger(ArrayList al)
    {
        Integer[] c = new Integer[al.size()];
        for(int i = 0; i < al.size(); i++)
        {
            c[i] = (Integer) al.get(i);
        }
        return c;

    }
    public Integer mostCommon()
    {

        ArrayUtility aU = new ArrayUtility();
       Integer mostCommonelement =  aU.mostCommon(castingMethodtoInteger(al));
       return mostCommonelement;
    }

    public Boolean contains(Integer valueToAdd)
    {
        Boolean check = false;
        if (al!= null)
        {
            for (Integer a:al)
            {
                if (a.equals(valueToAdd))
                {
                    check = true;
                    break;
                }
            }
        }
        return check;
    }
}
