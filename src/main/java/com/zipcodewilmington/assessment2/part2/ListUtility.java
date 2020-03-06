package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListUtility {

    private List<Integer> list;

    public ListUtility() {
        list = new ArrayList<>();
    }

    public Boolean add(Integer i) {
        list.add(i);
        return true;
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!results.contains(list.get(i)))
                results.add(list.get(i));
        }
        return results;
    }

    public String join() {
        String results = "";
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1)
                results += list.get(i).toString();
            else
                results += list.get(i).toString() + ", ";
        }
        return results;
    }

    public Integer mostCommon() {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (Integer i : list){
            if (count.containsKey(i))
                count.put(i, count.get(i) + 1);
            else
                count.put(i, 0);
        }
        Map.Entry<Integer, Integer> mostCommon = null;
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            if (mostCommon == null || entry.getValue() > mostCommon.getValue())
                mostCommon = entry;
        }
        return mostCommon.getKey();
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
