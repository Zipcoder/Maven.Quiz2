package com.zipcodewilmington.assessment2.part1;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if(array.length % 2 == 0){
            return true;
        }

        return false;
    }
    public Integer[] range(int start, int stop) {
        int[] result = java.util.stream.IntStream.rangeClosed(start, stop).toArray();
        Integer[] output = Arrays.stream( result ).boxed().toArray( Integer[]::new );
        return output;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        int sum = 0;
        for(int i = 0; i < array.length-1;i++){
            sum += array[i];
        }
        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        int product = 0;
        for(int i = 0; i < array.length;i++){
            if(array[1] == 0){
                continue;
            }
            product = array[1] * array[2];
        }
        return product;
    }
}
