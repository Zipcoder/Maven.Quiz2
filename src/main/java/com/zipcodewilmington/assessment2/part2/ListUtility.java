package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;

import java.util.List;

public class ListUtility {
    List<Integer> listNow = new ArrayList<>();

        public Boolean add(int i) {

            return listNow.add(i);
        }

        public Integer size() {
            return listNow.size();
        }

        public List<Integer> getUnique() {
            return null;
        }

        public String join() {
            return listNow.toString().substring(1, listNow.toString().length()-1);
        }

        public Integer mostCommon() {
            Integer[] first = new Integer[listNow.size()];
            return null;
        }

        public Boolean contains(Integer valueToAdd) {
            return listNow.contains(valueToAdd);
        }
    }
