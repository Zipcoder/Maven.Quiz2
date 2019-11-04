package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
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
        ArrayUtility arrayUtility = new ArrayUtility();
        Integer[] listAsArray = new Integer[list.size()];
        listAsArray = list.toArray(listAsArray);
            return arrayUtility.mostCommon(listAsArray);
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

