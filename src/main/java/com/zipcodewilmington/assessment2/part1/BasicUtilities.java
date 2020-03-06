package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        if (value == 0) {
            return false;
        }
        else if (value >=5) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isLessThan7(Integer value) {
        if (value <= 7) {
            return true;
        }else if (value > 7){
            return false;} else{
                return true;
            }
        }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        if(valueToEvaluate == 0) {
            return false;
        } else if (valueToEvaluate <=7 && valueToEvaluate>= 5) {
        return true;
        } else

    {
        return false;
    }
    }

    public Boolean startsWith(String string, Character character) {
        return string.charAt(0) == character || string.toLowerCase().charAt(0) == character;
    }
}
