package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        return value >= 5;
    }

    public Boolean isLessThan7(Integer value) {
        return value <= 7;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        return valueToEvaluate >= 5 && valueToEvaluate <= 7;
    }

    //OPTIMIZE
    public Boolean startsWith(String string, Character character) {
        String lowString = string.toLowerCase();
        String charToLower = character.toString().toLowerCase();
        return lowString.charAt(0) == charToLower.charAt(0);
    }
}
