package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    Integer dividend;
    public WuTangConcatenator(Integer input) {
        this.dividend = input;
    }

    public Boolean isWu() {
        return dividend %3 == 0;
    }

    public Boolean isTang() {
        return dividend % 5 ==0;
    }

    public Boolean isWuTang() {
        return dividend % 15 == 0;
    }
}
