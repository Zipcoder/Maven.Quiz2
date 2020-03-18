package com.zipcodewilmington.assessment2.part2;

//import com.sun.tools.hat.internal.model.JavaObjectArray;
//import com.sun.tools.javac.code.Attribute;
//import com.sun.tools.javac.util.ArrayUtils;
//import com.sun.tools.javac.util.List;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] merged = new Integer[array1.length + array2.length];

        System.arraycopy(array1, 0, merged, 0, array1.length);
        System.arraycopy(array2, 0, merged, array1.length, array2.length);
        return merged;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] rotated = new Integer[array.length];
        int count = 0;
        for (int i = index; i < array.length; i++){
            rotated[count] = array[i];
            count++;
        }

        for (int i = 0; i < index; i++){
            rotated[count] = array[i];
            count++;
        }

        return rotated;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer occur = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == valueToEvaluate) {
                occur++;
            }
        }
        for (int j = 0; j < array2.length; j++){

            if (array2[j] == valueToEvaluate){
                occur++;
            }
        }
        return occur;
    }

    public Integer mostCommon(Integer[] array) {
        int count = 1, tempCount;
        Integer popular = array[0];
        Integer temp = 0;
        for (int i = 0; i < (array.length - 1); i++)
        {
            temp = array[i];
            tempCount = 0;
            for (int j = 1; j < array.length; j++)
            {
                if (temp == array[j])
                    tempCount++;
            }
            if (tempCount > count)
            {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;
    }
}
