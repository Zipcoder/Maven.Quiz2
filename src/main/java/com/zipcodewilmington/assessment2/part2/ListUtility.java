package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class ListUtility {
    private ArrayList<Integer> list;

    public ListUtility() {
        this.list = new ArrayList<Integer>();
    }

    public Boolean add(Integer i) {
        try {
            this.list.add(i);
            return true;
        } catch (NullPointerException e) {
            return false;
        }
    }

    public Integer size() {
        return this.list.size();
    }

    public List<Integer> getUnique() {
        HashSet<Integer> unique = new HashSet<Integer>(this.list);

        return new ArrayList<Integer>(unique);
    }

    public String join() {
        String[] sArray = new String[this.list.size()];
        for (int i = 0; i < this.list.size(); i++) {
            sArray[i] = this.list.get(i).toString();
        }

        return String.join(", ",sArray);
    }

    public Integer mostCommon() {

        Integer[] array = this.list.toArray(new Integer[this.list.size()]);
        return mostCommon(array);
    }

    public Integer mostCommon(Integer[] array) {
        int max = 0;
        TreeMap<Integer, Integer> counts = new TreeMap<Integer,Integer>();
        for (Integer num : array) {
            counts.put(countOccurrence(array,num),num);
        }
        return counts.get(counts.lastKey());
    }

    public Integer countOccurrence(Integer[] array1, Integer valueToEvaluate) {
        int count = 0;
        for (Integer num : array1) {
            if (num == valueToEvaluate){
                count++;
            }
        }
        return count;
    }

    public Boolean contains(Integer valueToAdd) {
        return this.list.contains(valueToAdd);
    }
}
