package com.zipcodewilmington.assessment2.part2;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class ListUtility {
    ArrayList<Integer> testList = new ArrayList<>();

    public Boolean add(Integer i) {
        Integer j = i;
        testList.add(j);
        return testList.contains(j);
    }

    public Integer size() {
        return testList.size();
    }

    public List<Integer> getUnique() {
        HashSet<Integer> test = new HashSet<>(this.testList);
        ArrayList<Integer> answer = new ArrayList<>(test);
        return answer;
    }

    public String join() {
        String answer ="";
        for (int i = 0; i <testList.size()-1 ; i++) {
            answer+= testList.get(i) + ", ";
        }
        answer+= testList.get(testList.size()-1);

        return answer;
    }

    public Integer mostCommon() {
        Integer answer=-1;
        Integer counter = 0;
        Integer countAgainst =0;

        for (int i = 0; i <testList.size() ; i++) {
            for (int j = 0; j <testList.size() ; j++) {
                if(testList.get(i).equals(testList.get(j))){
                    counter++;
                    if(counter>countAgainst){
                        countAgainst=counter;
                        answer = testList.get(j);
                    }
                }

            }
            counter=0;
        }


        return answer;
    }

    public Boolean contains(Integer valueToAdd) {

            if (testList.contains(valueToAdd)) {
                return true;
            }

        return false;
    }
}
