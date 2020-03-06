package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    Integer numToCheck;
    public WuTangConcatenator(Integer input) {
        this.numToCheck = input;
    }

    public Boolean isWu() {
        if(numToCheck % 3 == 0){
            return true;
        }
        return false;
    }

    public Boolean isTang() {
        if(numToCheck % 5 == 0){
            return true;
        }
        return false;
    }

    public Boolean isWuTang() {
        if(isWu() && isTang()){
            return true;
        }
        return false;
    }
}
