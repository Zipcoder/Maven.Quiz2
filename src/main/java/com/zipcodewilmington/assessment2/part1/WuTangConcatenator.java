package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

    private Integer holding;

    public WuTangConcatenator(Integer input) {
        this.holding = input;
    }

    public Boolean isWu() {
        return this.holding % 3 == 0;
    }

    public Boolean isTang() {
        return this.holding % 5 == 0;
    }

    public Boolean isWuTang() {
        return isWu() && isTang();
    }
}
