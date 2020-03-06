package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        return value >= 5;
    }

    public Boolean isLessThan7(Integer value) {

        return value <=7;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        if(valueToEvaluate >=5 && valueToEvaluate<= 7){
            return true;

        }        return false;
    }

    public Boolean startsWith(String string, Character character) {
        Character chare = Character.toUpperCase(character);
        if (string.charAt(0) == chare){
            return true;

        }        return false;
    }
}
