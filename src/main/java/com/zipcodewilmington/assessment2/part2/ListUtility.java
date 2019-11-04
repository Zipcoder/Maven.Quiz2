package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListUtility {
    private List<Integer> list;

    public ListUtility() {
        this.list = new ArrayList<Integer>();
    }

    public Boolean add(int i) {
        Integer[] arr = new Integer[list.size()+1];
        for (int iter = 0; iter < list.size(); iter++) {
            arr[iter] = list.get(iter);
        }
        arr[arr.length-1] = i;
//        try {
//            return list.add(i);
//        } catch (Exception e) {
//            list.add(null);
//            return true;
//        }
        list = new ArrayList<Integer>(Arrays.asList(arr));
        return true;
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        List<Integer> uniques = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!uniques.contains(list.get(i))) {
                uniques.add(list.get(i));
            }
        }
        return uniques;
    }

    public String join() {
        StringBuilder output = new StringBuilder();
        for (Integer value: list) {
            output.append(value);
            if (value != list.get(list.size()-1)) {
                output.append(", ");
            }
        }
        return output.toString();
    }

    public Integer mostCommon() {
        Integer commonValue = 0;
        Integer maxCount = 0;
        for (int i = 0; i < list.size(); i++) {
            Integer occurrences = countOccurrence(list.get(i));
            if (occurrences > maxCount) {
                maxCount = occurrences;
                commonValue = list.get(i);
            }
        }
        return commonValue;
    }

    public Integer countOccurrence(Integer valueToEvaluate) {
        Integer count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(valueToEvaluate)) {
                count += 1;
            } else if (list.get(i) == null && valueToEvaluate == null) {
                count++;
            }
        }
        return count;
    }

    public Boolean contains(Integer valueToAdd) {
        try {
            return countOccurrence(valueToAdd) > 0;
        } catch (NullPointerException e) {
            return true;
        }

//        Boolean contain = false;
//        for (Integer num : list) {
//            if (num == valueToAdd) {
//                contain = true;
//                break;
//            }
//        }
//        return contain;
    }
}