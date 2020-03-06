package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility  {

   public List<Integer> list;

   public ListUtility(){
       list = new ArrayList<>();
   }

    public Boolean add(Integer i) {
        list.add(i);
        return list.contains(i);
    }

    public Integer size() {

       return list.size();
    }

    public List<Integer> getUnique() {
       List<Integer> result = new ArrayList<>();
        for(Integer i : list){
            if(!result.contains(i)){
                result.add(i);
            }
        }
       return result;
    }

    public String join() {
       String s = "";

        for(Integer i : list){
            if(list.size()==1){
                return i.toString();
            }
            else{

                s+=i+", ";
            }

        }
        s=s.substring(0,s.length()-2);
       return s;
    }

    public Integer mostCommon() {
        ArrayUtility au = new ArrayUtility();
        Integer[] result = new Integer[list.size()];
        result = list.toArray(result);
        Integer mc = au.mostCommon(result);

       return mc;

    }

    public Boolean contains(Integer valueToAdd) {

       return list.contains(valueToAdd);
    }



}
