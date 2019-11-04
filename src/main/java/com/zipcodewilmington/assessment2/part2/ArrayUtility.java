package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        int arrayLength = array1.length + array2.length;
        Integer[] outputArray = new Integer[arrayLength];
        int j = 0;
        for (int i=0; i<arrayLength; i++)
        {

            if (i<array1.length)
            {
                outputArray[i] = array1[i];

            }
            else
                {

                outputArray[i] = array2[j];
                j++;
            }
        }


        return outputArray;
    }

    public Integer[] rotate(Integer[] array, Integer index)
    {
        Integer array2[] = new Integer[array.length];
        int j=0;
        for (int i= index; i< array.length; i++)
        {
            array2[j] = array[i]    ;
            j++  ;
        }

        for (int k = 0; k<index; k++)
        {
            array2[j] = array[k];
            j++;
        }
       return array2;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate)
    {
        Integer count = 0;
        for (int i=0 ; i < array1.length ; i++)
        {
            if (array1[i].equals(valueToEvaluate))
                count++;
        }

        for (int j=0 ; j< array2.length; j++)
        {
            if (array2[j].equals(valueToEvaluate))
                count++;
        }

        return count;
    }



    public Integer mostCommon(Integer[] array) {

        int newCount = 0;
        int mostCount = 0;
        Integer mostCommon =0;
        Integer array2[] = {};
        for (int i=0 ; i<array.length ; i++)
        {
            newCount = countOccurrence(array,array2,array[i]);
            if (newCount > mostCount)
            {
                mostCount = newCount;
                mostCommon = array[i];
            }

        }
        return mostCommon;

    }
}
