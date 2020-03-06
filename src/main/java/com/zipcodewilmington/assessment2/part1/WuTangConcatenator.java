package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    public Integer Wu;
    public Integer Tang;
    public Integer WuTang;
    public Integer value;

    public WuTangConcatenator(Integer input) {
    }

    public Boolean isWu() {
        if (value % 3 == 0) {
            value = Wu;
            return true;
        }
        return false;
    }

    public Boolean isTang() {
        if (value % 5 == 0) {
            value = Tang;
            return true;
        }
        return false;
    }
    public Boolean isWuTang() {
        if (WuTang % 3 == 0 && WuTang % 5 ==0) {
            value = WuTang;
            return true;
        }
        return false;
    }
}
