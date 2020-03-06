package com.zipcodewilmington.assessment2.part2;

import com.sun.tools.hat.internal.model.JavaObjectArray;
import com.sun.tools.javac.code.Attribute;
import com.sun.tools.javac.util.ArrayUtils;
import com.sun.tools.javac.util.List;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] merged = new Integer[array1.length + array2.length];

        System.arraycopy(array1, 0, merged, 0, array1.length);
        System.arraycopy(array2, 0, merged, array1.length, array2.length);
        return merged;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return null;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
