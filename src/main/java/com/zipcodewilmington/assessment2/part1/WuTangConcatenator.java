package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    Integer input;

    public WuTangConcatenator(Integer input) {
        this.input = input;
    }

    public Boolean isWu() {
        Boolean isWu;
        if (this.input % 3 == 0) {
            isWu = true;
        } else isWu = false;
        return isWu;
    }

    public Boolean isTang() {
        Boolean isTang;
        if (this.input % 5 == 0) {
            isTang = true;
        } else isTang = false;
        return isTang;
    }

    public Boolean isWuTang() {
        Boolean isWuTang;
        if (this.input % 3 == 0 && this.input % 5 == 0) {
            isWuTang = true;
        } else isWuTang = false;
        return isWuTang;
    }
}
