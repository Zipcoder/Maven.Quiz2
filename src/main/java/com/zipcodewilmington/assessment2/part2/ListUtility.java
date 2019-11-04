package com.zipcodewilmington.assessment2.part2;



import java.util.*;

public class ListUtility {

    List<Integer>list = new ArrayList<>();


    public Boolean add(Integer e) {
        return list.add(e);

    }

    public Integer size() {

        return list.size();
    }

    public List<Integer> getUnique() {
        Set<Integer> set= new TreeSet<>();
        for (int i : list){
            set.add(i);
        }
        List<Integer> nuList = new ArrayList<>(set);
        return nuList;
    }

    public String join() {
        return null;
    }

    public Integer mostCommon() {
        Collections.sort(list);
        int count1 = 1;
        int newMax = 1;
        int mostCommon = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == list.get(i - 1)) {
                count1++;
            } else {
                if (count1 > newMax) {
                    newMax = count1;
                    mostCommon = list.get(i - 1);
                }
                count1 = 1;
            }
            if (count1 > newMax) {
                mostCommon = list.get(list.size() - 1);

            }
        }
        return mostCommon;

    }


    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
