package com.zipcodewilmington.assessment2.part2;

import java.util.List;

public class ListUtility {
    ListUtility utility;
    public Boolean add(int i) {
        utility.add(i);
        utility.contains(i);
        return true;
    }

    public Integer size() {
        Integer result = utility.size();
        return result;
    }

    public List<Integer> getUnique() {
        return null;
    }

    public String join() {
        return null;
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {
        utility.add(valueToAdd);
        utility.contains(valueToAdd);
        return true;
    }
}
