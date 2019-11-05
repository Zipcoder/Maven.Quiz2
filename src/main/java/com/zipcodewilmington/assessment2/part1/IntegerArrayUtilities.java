package com.zipcodewilmington.assessment2.part1;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {

        return (array.length %2 == 0);
    }

    public Integer[] range(int start, int stop) {
       Integer [] arrayX = new Integer[stop - (start-1)];
       Integer counter = 0;
       for(int i = start; i <=stop; i++)
           arrayX[counter] = i;


        IntStream rangeArray = IntStream.range(start, stop+1);
       int [] array = rangeArray.toArray();

        return Arrays.stream(array)
                .boxed()
                .toArray(Integer [] :: new);
        
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0]+array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length-1] * array[array.length-2];
    }
}
