package com.zipcodewilmington.assessment2.part1;

import java.sql.Array;
import java.util.Arrays;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array)
    {
        if(array.length%2==0){
        return true;
    }
    return false;
}

    public Integer[] range(int start, int stop) {
       int c=0;
       for(int i=start;i<=stop ;i++){
         c=c+1;
       }
       int l=c;
       System.out.println(l);
       Integer arr[]=new Integer[l];
       int j=start,i=0;
       while(arr.length<l){
         arr[i]=j;
         j++;
       }





       return arr;

    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        int sum=0;
        sum=sum+array[0]+array[1];

        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        int product=1;

        product=product*array[array.length-2]*array[array.length-1];
        return product;
    }
}
