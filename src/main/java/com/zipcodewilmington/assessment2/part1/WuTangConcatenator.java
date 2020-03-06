package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    public Integer Wu;
    public Integer Tang;
    public Integer WuTang;

    public WuTangConcatenator(Integer input) {
    }

    public Boolean isWu() {
        if (Wu % 3 == 0) {
            return true;
        }
        return false;
    }

    public Boolean isTang() {
        if (Tang % 5 == 0) {
            return true;
        }
        return false;
    }
    public Boolean isWuTang() {
        if (WuTang % 3 == 0 && WuTang % 5 ==0) {
            return true;
        }
        return false;
    }
}
