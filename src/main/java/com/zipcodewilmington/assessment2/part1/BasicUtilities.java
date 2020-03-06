package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {

        return value>=5;
    }

    public Boolean isLessThan7(Integer value) {

        return value<=7;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        if(isGreaterThan5(valueToEvaluate)&&isLessThan7(valueToEvaluate)){
            return true;
        }
        return false;
    }

    public Boolean startsWith(String string, Character character) {
        String lower = string.toLowerCase();
        String upper = string.toUpperCase();

        if(lower.charAt(0)==character||upper.charAt(0)==character){
            return true;
        }
        return false;
    }
}
