package com.zipcodewilmington.assessment2.part2;
import java.util.ArrayList;

import java.util.List;


public class ListUtility {
    ArrayList<Integer> list = new ArrayList<Integer>();
    public Boolean add(int i) {
        return list.add(i);

    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        return null;
    }

    public String join() {
        StringBuilder builder = new StringBuilder();
        // Append all Integers in StringBuilder to the StringBuilder.
        for (int number : list) {
            builder.append(number);
            builder.append(",");
        }
        // Remove last delimiter with setLength.
        builder.setLength(builder.length() - 1);
        return builder.toString();
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
