package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if (array.length % 2 == 0)
            return true;

        return false;
    }


    public Integer[] range(int start, int stop) {
        List<Integer> result = new ArrayList<>();
        for (int i = start; i <= stop; i++) {
            result.add(i);
        }

        Integer[] finalResult = new Integer[result.size()];
        for (int i = 0; i < result.size(); i++) {
            finalResult[i] = result.get(i);
        }
        return finalResult;

}

        public Integer getSumOfFirstTwo ( Integer[]array){
            return array[0] + array[1];
        }

        public Integer getProductOfFirstTwo ( Integer[]array){
            return array[array.length - 1] * array[array.length - 2];
        }
    }
