package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class ListUtility
{
    List<Integer> iList;

    public ListUtility()
    {
        iList = new ArrayList<>();
    }

    public Boolean add(int i) {
        return iList.add(i);
    }

    public Integer size() {
        return iList.size();
    }

    public List<Integer> getUnique() {
        Set<Integer> uniques = new HashSet<>(iList);

        List<Integer> uniquesAsList = new ArrayList<>(uniques);
        return uniquesAsList;
    }

    public String join() {
        StringBuilder joinedWithCommas = new StringBuilder();

        for(Integer element : iList)
        {
            joinedWithCommas.append(element).append(", ");
        }

        return (joinedWithCommas.substring(0, joinedWithCommas.length() - 2));
    }

    public Integer mostCommon() {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer element : iList) {
            Integer val = map.get(element);
            map.put(element, val == null ? 1 : val + 1);
        }

        Map.Entry<Integer, Integer> max = null;

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (max == null || e.getValue() > max.getValue())
                max = e;
        }

        return max.getKey();
    }

    public Boolean contains(Integer valueToAdd) {
        return iList.contains(valueToAdd);
    }
}
