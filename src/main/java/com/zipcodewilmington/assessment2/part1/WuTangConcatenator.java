package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    public int myInt = 0;
    public WuTangConcatenator(Integer input) {
        this.myInt = input;
    }

    public Boolean isWu() {
        if(!isWuTang()) {
            return this.myInt % 3 == 0;
        }
        return false;
    }

    public Boolean isTang() {
        if(!isWuTang()) {
            return this.myInt % 5 == 0;
        }
        return false;
    }

    public Boolean isWuTang() {
        if(this.myInt % 5 == 0 && this.myInt % 3 == 0) {
            return true;
        }
        return false;
    }
}
