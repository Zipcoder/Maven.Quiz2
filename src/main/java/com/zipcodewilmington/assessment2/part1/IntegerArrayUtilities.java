package com.zipcodewilmington.assessment2.part1;

import com.j256.ormlite.stmt.query.In;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if (array.length % 2 == 0){
            return true;
        }
        return false;
    }

    public Integer[] range(int start, int stop) {

        int[] nums = java.util.stream.IntStream.rangeClosed(start, stop).toArray();

        Integer[] newArray = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++){
            newArray[i] = Integer.valueOf(nums[i]);
        }

        return newArray;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        return array[0].intValue() + array[1].intValue();
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length - 2].intValue() * array[array.length - 1].intValue();
    }
}
