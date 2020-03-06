package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        if (value >= 5) {
            return true;
        } else {
            return false;
        }
    }


    public Boolean isLessThan7(Integer value) {
        if (value <= 7) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        if ((valueToEvaluate % 5 == 0 || valueToEvaluate % 6 == 0 || valueToEvaluate % 7 == 0) && (valueToEvaluate != 0)) {
            return true;

        } else {
            return false;
        }
    }


    public Boolean startsWith(String string, Character character) {
        char[] result = string.toCharArray();
        for (int i = 0; i < string.length(); i++)
            if (result[0] == character || result[0] == character.toUpperCase(character))
                return true;
        return false;
    }
}


