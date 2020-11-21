package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.*;
import java.util.logging.Level;
import java.util.stream.Collectors;


public class ListUtility {
    ArrayList<Integer> testList = new ArrayList<>();

    public Boolean add(int i) {
        testList.add(i);
        //System.out.println(testList.contains(i));
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

        HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();
        for (int i : testList)
            if (elementCountMap.containsKey(i)) {
                elementCountMap.put(i, elementCountMap.get(i) + 1);
            } else {
                elementCountMap.put(i, 1);
            }
        System.out.println(elementCountMap.keySet());
        System.out.println(elementCountMap.values());

        Integer element = 0;
        Integer frequency = 1;

//
//        for (Map.Entry entry : elementCountMap.entrySet()) {
//            if (entry.getValue() > frequency) {
//                element = entry.getKey();
//
//                frequency = entry.getValue();
//            }
//        }
////        Map<Integer, Integer> element = new HashMap<>();
//        for (int i : testList) {
//            if (element.containsKey(i)) {
//                element.put(i, element.get(i) + 1);
//            } else {
//                element.put(i, 1);
//            }
//        }
//        Integer frequency = 0;
//        if(!element.isEmpty()) {
//            Iterator it = element.entrySet().iterator();
//            while(it.hasNext()) {
//                if (element)
//            }
//
//
//        Integer mostCom = 0;
//        Set<Map.Entry<Integer,Integer> >mostOften = element.entrySet();
//        for (Map.Entry<Integer, Integer> ent : mostOften) {
//            if (ent.getValue() > frequency) {
//                mostCom = ent.getKey();
//            }
//        }
        return null;
    }


        public Boolean contains (Integer valueToAdd){
            System.out.println(testList);
            return testList.contains(valueToAdd);
        }
    }
