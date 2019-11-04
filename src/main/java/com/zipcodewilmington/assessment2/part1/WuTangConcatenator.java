package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    // declare a variable to use
    public Integer userInput;

    public WuTangConcatenator(Integer input) {
        // assign new variable to input
        this.userInput = input;
    }

    public Boolean isWu() {
        return userInput % 3 == 0;
    }

    public Boolean isTang() {
        return userInput % 5 == 0;
    }

    public Boolean isWuTang() {
        return userInput % 15 == 0;
    }
}
