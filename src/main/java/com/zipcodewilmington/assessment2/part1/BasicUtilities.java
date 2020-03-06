package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {

         for (int i = 0; i < Math.abs(value); i++) {
         if (value >= 5){
            return true;
        }
        }
        return false;
    }

    public Boolean isLessThan7(Integer value) {
        return null;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        return null;
    }

    public Boolean startsWith(String string, Character character) {
        return null;
    }
}
