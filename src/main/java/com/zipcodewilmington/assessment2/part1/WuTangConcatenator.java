package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    Integer wuTang;
    public WuTangConcatenator(Integer input) {
        wuTang = input;
    }

    public Boolean isWu() {
        return wuTang % 3 == 0;
    }

    public Boolean isTang() {
        return wuTang % 5 == 0;
    }

    public Boolean isWuTang() {
        return isWu() && isTang();
    }
}
