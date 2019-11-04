package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        if (value >= 5) {
            return true;
        }
        return false;
    }

    public Boolean isLessThan7(Integer value) {
        if (value <= 7) {
            return true;
        }
        return false;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        if (valueToEvaluate >= 5 && valueToEvaluate <= 7) {
            return true;
        }
        return false;
    }

    public Boolean startsWith(String string, Character character) {

        char[] newArr = string.toCharArray();

        Character lwrCase = Character.toLowerCase(character);
        String strLwrCase = string.toLowerCase();

        char[] newArr2 = strLwrCase.toCharArray();

        for (int i = 0; i < newArr.length; i++) {
            if (newArr[0] == character || newArr[0] == lwrCase) {
                return true;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            if (newArr2[0] == lwrCase) {
                return true;
            }
            ;
        }
        return false;
    }
}