package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListUtility{
    ArrayList<Integer> list = new ArrayList<>();

    public Boolean add(int i) {
        return list.add(i);
    }

    public Integer size() {

        return list.size();
    }

    public List<Integer> getUnique() {

        ArrayList<Integer> dummy = new ArrayList();


            for (int i = 0; i < list.size(); i++) {
                if (!dummy.contains(list.get(i))) {
                    dummy.add(list.get(i));
                }
            }
            return dummy;



    }

        public String join () {
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i < list.size() ; i++ ){
            str.append(list.get(i));
            if(i != list.size()-1) str.append(", ");
        }
        return str.toString();
        }


         public Integer[]  castingToIntegerArray(ArrayList list){
                Integer[] arr = new Integer[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    arr[i] = (Integer) list.get(i);
                }
                return arr;

            }
    public Integer mostCommon () {

            ArrayUtility au = new ArrayUtility();
            Integer mostCommonEl = au.mostCommon(castingToIntegerArray(list));
            return mostCommonEl;
        }

        public Boolean contains (Integer valueToAdd){
            return list.contains(valueToAdd);
        }


    }

