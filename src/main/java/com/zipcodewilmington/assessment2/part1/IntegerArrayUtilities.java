package com.zipcodewilmington.assessment2.part1;

import org.w3c.dom.ranges.Range;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if (array.length % 2 == 0)
            return true;
        else
            return false;
    }

    public Integer[] range(int start, int stop) {
        List<Integer> rangeBetweenStartStop = IntStream.rangeClosed(start, stop)
                .boxed().collect(Collectors.toList());
        return rangeBetweenStartStop.toArray(new Integer[0]);
    }


    public Integer getSumOfFirstTwo(Integer[] array) {

        return array[0] + array[1];
    }
        public Integer getProductOfFirstTwo (Integer[]array){
            return array[array.length-2] * array[array.length-1];
        }
    }
