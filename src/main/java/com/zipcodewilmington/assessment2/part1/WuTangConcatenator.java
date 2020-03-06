package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

    Integer a = 0;

    public WuTangConcatenator(Integer input) {
        this.a = input;
    }

    public Boolean isWu() {
        return a % 3 == 0;
    }

    public Boolean isTang() {
        return a % 5 == 0;
    }

    public Boolean isWuTang() {
        return a % 3 == 0 && a % 5 == 0;
    }
}
