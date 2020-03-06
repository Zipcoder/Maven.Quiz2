package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    ArrayList<Integer> testList = new ArrayList<>();

    public Boolean add(int i) {
      testList.add(i);
        return testList.contains(i);
    }

    public Integer size() {
        return testList.size();
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
        if(!valueToAdd.equals(null)) {
            if (testList.contains(valueToAdd)) {
                return true;
            }
        }
        return false;
    }
}
