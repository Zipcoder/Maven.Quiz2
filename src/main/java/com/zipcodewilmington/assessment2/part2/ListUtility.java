package com.zipcodewilmington.assessment2.part2;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.zipcodewilmington.assessment2.part2.ArrayUtility;

import static com.zipcodewilmington.assessment2.part2.ArrayUtility.*;

public class ListUtility {
    List<Integer> list = new ArrayList<>();
    public Boolean add(int i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        ArrayList<Integer> unique = new ArrayList<>();
        for (Integer i : list){
            if (!unique.contains(i)){
                unique.add(i);
            }
        }
        return unique;
    }

    public String join() {
        String listAsString = "";
        if (list.size() <= 1){
            for (Integer i : list){
            listAsString += i.toString();
            }
        }else{
            for (Integer i = 0; i < list.size(); i++){
                if (i  < list.size() -1){
                listAsString += list.get(i).toString() + ", ";
                }else {
                    listAsString += list.get(i).toString();
                }
            }
        }
        return listAsString;
    }

    public Integer mostCommon() {
       Integer[] repeatingNums = {0,0,0,0,0,0,0,0,0,0,0};
        int index = 0;
        for (Integer i: list){
            for (Integer j : list){
                if (j.equals(i)){
                    repeatingNums[index]++;
                }
            }
            index++;
        }
        Integer mostCommon = 0;
        for (int i = 0; i < repeatingNums.length - 1; i++){
            if (repeatingNums[i] >= repeatingNums[i+1] && repeatingNums[i + 1] >= repeatingNums[0] ) {
                mostCommon = list.get(i);
            }
        }

        return mostCommon;

    }


    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
