package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {

    public Boolean isGreaterThan5(Integer value){
        return value >= 5;
    }

    public Boolean isLessThan7(Integer value) {
        return value <= 7;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        Boolean isBetween;
        if (valueToEvaluate >= 5 && valueToEvaluate <= 7) {
            isBetween = true;
        } else {
            isBetween = false;
        } return isBetween;
    }

    public Boolean startsWith(String string, Character character) {
        String stringUpper = string.toUpperCase();
        String stringLower = string.toLowerCase();
        Boolean startsWith;
        return stringUpper.charAt(0) == character || stringLower.charAt(0) == character;
    }
}
