package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    public Integer Wu;
    public Integer Tang;
    public Integer WuTang;
    public Integer value = 0;
    public WuTangConcatenator(Integer input) {
    }

    public Boolean isWu() {
        if (value % 3 == 0) {
            return true;
        }
        return false;
    }

    public Boolean isTang() {
        if (value % 5 == 0) {
            return true;
        }
        return false;
    }
    public Boolean isWuTang() {
        if (value % 3 == 0 && value % 5 ==0) {
            return true;
        }
        return false;
    }
}
