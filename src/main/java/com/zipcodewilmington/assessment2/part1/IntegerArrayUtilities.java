package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if (array.length == 0 || array.length%2 == 0) return true;
        else return false;
    }

    public Integer[] range(int start, int stop) {

        ArrayList<Integer> list = new ArrayList();
        for (int i = start; i <= stop; i++) {
            list.add(i);
        }
       // Integer[] array = (Integer[]) list.toArray();
        return castingMethodtoInteger(list);
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0]+array[1];

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

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length-2]*array[array.length-1];
    }
}
