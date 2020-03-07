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
//        list.toArray();
//        for (int i = 0; i < list.size(); i++){
//            for (int j = 0; j < list.size() - 1; j++){
//                if (list.toArray()[i] != list.toArray()[j]){
//                    list.add(i);
//                    break;
//                }
//            }
//        }
        return list;
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
