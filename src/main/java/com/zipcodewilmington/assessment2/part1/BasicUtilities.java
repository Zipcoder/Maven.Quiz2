package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {


    public Boolean isGreaterThan5(Integer value) {
        if(value >= 5){
            return true;
        }else{
            return false;
        }
    }

    public Boolean isLessThan7(Integer value) {
        if(value <= 7){
            return true;
        }else{
            return false;
        }
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        if(valueToEvaluate >= 5 && valueToEvaluate <=7){
            return true;
        }else{
            return false;
        }
    }

    public Boolean startsWith(String string, Character character) {
        Character first = string.charAt(0);

        if(first.toString().toUpperCase().equals(character.toString().toUpperCase())){
            return true;
        }else if(first.toString().toLowerCase().equals(character.toString().toLowerCase())){
            return true;
        }else {
            return false;
        }

    }
}
