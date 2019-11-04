package com.zipcodewilmington.assessment2.part1;
public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        return value >= 5;
    }

    public Boolean isLessThan7(Integer value) {
        return value <= 7;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {

        if (valueToEvaluate <= 7 && valueToEvaluate >= 5)
            return true;
        else
        return false;
    }

    public Boolean startsWith(String string, Character character) {
        if (string.toLowerCase().charAt(0) == character)
            return true;
        else if( string.toUpperCase().charAt(0) == character)
        return true;

        else return false;
    }

}
