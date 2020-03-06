package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ListUtility {

    ArrayList<Integer> listOfNums = new ArrayList<>();

    public boolean add(int i) {

        if((Integer)i == null){
            return false;
        }else{
            this.listOfNums.add(i);
            return true;
        }
    }

    public Integer size() {
        return this.listOfNums.size();
    }

    public List<Integer> getUnique() {

        ArrayList<Integer> holder = new ArrayList<>();
        HashMap<Integer , Integer> hashy = new HashMap<>();
        for (int i = 0; i < listOfNums.size(); i++) {
            if (!hashy.containsValue(listOfNums.get(i))){
                holder.add(listOfNums.get(i));
                hashy.put(listOfNums.get(i), i);
            }else {
                hashy.put(listOfNums.get(i), i);
            }
        }
        Integer[] answer = new Integer[hashy.size()];
        int index = 0;
        for(Integer element : hashy.keySet()){
            answer[index] = element;
            index++;
        }
        List<Integer> answer2 = Arrays.asList(answer);
        return answer2;
    }

    public String join() {
        String temp = "";

        if(listOfNums.size() == 1){
            temp += listOfNums.get(0);
        }else {
            int count =0;
            for(Integer element : listOfNums){
                if(count == 0){
                    temp += element;
                    count++;
                }else {
                    temp += ", " + element;
                }
            }
        }

        return temp;
    }

    public Integer mostCommon() {
        Integer[] holder = new Integer[listOfNums.size()];
        int indx = 0;
        for(Integer elelment : listOfNums){
            holder[indx] = elelment;
        }

        ArrayUtility temp = new ArrayUtility();
        Integer answer = temp.mostCommon(holder);
        return answer;
    }

    public Boolean contains(Integer valueToAdd) {
        if(this.listOfNums.contains(valueToAdd)){
            return true;
        }else {
            return false;
        }
    }
}
