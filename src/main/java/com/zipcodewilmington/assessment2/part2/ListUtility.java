package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.*;
import java.util.logging.Level;


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
        Set<Integer> uniqueSet;
        uniqueSet = new HashSet<Integer>(testList);
        return new ArrayList<Integer>(uniqueSet);
    }

    public String join() {
        StringBuilder arrayString = new StringBuilder("");
        for (int i = 0; i < testList.size() - 1; i++) {
            arrayString.append(testList.get(i)).append(", ");
        }
            arrayString.append(testList.get(testList.size() - 1));
        return arrayString.toString();
    }

    public Integer mostCommon() {
//        Map<Integer, Integer> mostElement = new HashMap<Integer, Integer>();
//        for (int i : testList) {
//            if (mostElement.containsKey(i)) {
//                mostElement.put(i, mostElement.get(i) + 1);
//            } else {
//                mostElement.put(i, 1);
//            }
//        }
//        Integer frequency = 0;
//        Integer mostCom = 0;
//        Set<Map.Entry<Integer,Integer> >mostOften = mostElement.entrySet();
//        for (Map.Entry<Integer, Integer> ent : mostOften) {
//            if (ent.getValue() > frequency) {
//                mostCom = ent.getValue();
//            }
//        }
        return null;
            }


    public Boolean contains(Integer valueToAdd) {
        System.out.println(testList);
        return testList.contains(valueToAdd);
    }
}
