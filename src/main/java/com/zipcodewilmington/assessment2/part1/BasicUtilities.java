package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {

    private Boolean greaterThanFive = false;
    private Boolean lessThanSeven = false;
    private Boolean between = false;

    public void evaluator(Integer value) {
        if(value >= 5)
            this.greaterThanFive = true;
        if(value <= 7)
            this.lessThanSeven = true;
        if(greaterThanFive && lessThanSeven)
            this.between = true;
    }

    public Boolean isGreaterThan5(Integer value) {
        evaluator(value);
        return greaterThanFive; }

    public Boolean isLessThan7(Integer value) {
        evaluator(value);
        return lessThanSeven;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        evaluator(valueToEvaluate);
        return between;
    }

    public Boolean startsWith(String string, Character character) {
        if (character <= 65 || character >= 90) {
            return character == string.charAt(0) || character == string.charAt(0) + 32;
        }
        if (character <= 97 || character >= 122) {
            return character == string.charAt(0) || character == string.charAt(0) - 32;
        }
        return false;
    }
}
