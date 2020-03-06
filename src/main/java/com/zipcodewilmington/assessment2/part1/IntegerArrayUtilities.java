package com.zipcodewilmington.assessment2.part1;

import com.j256.ormlite.stmt.query.In;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {


        if(array.length % 2 == 0){
            return true;
        }else {
            return false;
        }
    }

    public Integer[] range(int start, int stop) {

        Integer[] answer = new Integer[stop - start +1];
        int index = 0;
        for(Integer  x = start; x <= stop; x++){
            answer[index] = x;
            index++;
        }
        return answer;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        Integer first = array[0];
        Integer second = array[1];
        return first + second;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        Integer last = array[array.length -1];
        Integer secondToLast = array[array.length -2];
        return last * secondToLast;
    }
}
