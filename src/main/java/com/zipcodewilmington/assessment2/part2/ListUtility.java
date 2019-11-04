package com.zipcodewilmington.assessment2.part2;

import java.util.*;
import java.util.stream.Collectors;

public class ListUtility {
    ArrayList<Integer> list = new ArrayList<>();


    public Boolean add(int i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        TreeSet<Integer> intTreeSet = new TreeSet<>(list);
        return new ArrayList<>(intTreeSet);
    }

    public String join() {
        String result = "";
        if (list.size() == 1) {
            return list.get(0).toString();
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (i != list.size() - 1){
                    result += list.get(i) + ", ";
            } else {
                    result += list.get(i);
                }
            }
        }
        return result;
    }

        public Integer mostCommon () {
            int count = 0;
            int mostCommon = list.get(0);
            int temp = 0;
            int tempCount = 0;
            for(int i = 0; i <= list.size() - 1;i++){
                temp = list.get(i);
                tempCount = Collections.frequency(Collections.singletonList(list), temp);
            }
            if(tempCount > count){
                mostCommon = temp;
                count = tempCount;
                tempCount = 0;
            }
            return mostCommon;
        }


        public Boolean contains (Integer valueToAdd){
            for(int i = 0; i < list.size(); i++){
                if(list.get(i).equals(valueToAdd)){
                    return true;
                }
            }
            return false;
        }
    }

