package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    List<Integer> list = new ArrayList<>(); {
    }
    public Boolean add(int i) {
        if (list.add(i)){
            return true;
        }
        return false;
    }

    public Integer size() {
        return list.size();
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
        return null;
    }
}
