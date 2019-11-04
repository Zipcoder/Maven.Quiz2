package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
int l1=array1.length;
int l2=array2.length;
int l=l1+l2;
Integer[] mergedArray=new Integer[l];
for(int i = 0 ; i < l1 ;i++){
    mergedArray[i]=array1[i];

}
for(int j=0 ;j<l2;j++){
    mergedArray[l1+j]=array2[j];
}


        return mergedArray;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
    int counter=0;
    int i=1;

    Integer[]rotated=new Integer[array.length];
    while(counter<index){

        rotated[array.length-1]=array[0];
        rotated[i-1]=array[i];
        counter++;

    }




        return rotated;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int c=0;
        for(int i = 0;i <array1.length ;i++){
            if(array1[i]==valueToEvaluate){
                c++;
            }
        }
        for(int j = 0 ; j < array2.length ; j++){
            if(array2[j]== valueToEvaluate){
                c++;
            }
        }



        return c;
    }

    public Integer mostCommon(Integer[] array) {

       Integer[] arrOfNothing=new Integer[0];
        Integer[] occurrence=new Integer[array.length];
        for(int i = 0; i<array.length;i++)
        {
            occurrence[i]=countOccurrence( array,  arrOfNothing,  array[i]);

        }
       // System.out.println((Arrays.toString(occurrence)));

int mostCommon=occurrence[0];
        int maxIndex=0;
        for(int i=0 ;i<occurrence.length;i++){
            if(occurrence[i]>=mostCommon){
                mostCommon=occurrence[i];
                maxIndex=i;
            }
        }


        return array[maxIndex];
    }

}
