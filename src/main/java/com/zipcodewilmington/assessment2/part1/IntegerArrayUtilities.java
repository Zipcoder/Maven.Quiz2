package com.zipcodewilmington.assessment2.part1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if (array.length % 2 == 0)
            return true;

        return false;
    }


    public Integer[] range(int start, int stop) {
        //   int[] range = IntStream.iterate(1, n -> n + 1).limit(10).toArray();
        //  }
        return null;
    }

        public Integer getSumOfFirstTwo ( Integer[]array){
            return array[0] + array[1];
        }

        public Integer getProductOfFirstTwo ( Integer[]array){
            return array[array.length - 1] * array[array.length - 2];
        }
    }
