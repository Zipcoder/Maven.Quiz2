package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

    Integer input;

    public WuTangConcatenator(Integer input) {
        this.input = input;
    }

    public Boolean isWu() {

        if(this.input % 3 == 0){
            return true;
        }else {
            return false;
        }
    }

    public Boolean isTang() {
        if(this.input % 5 == 0){
            return true;
        }else {
            return false;
        }
    }

    public Boolean isWuTang() {
        if(this.input % 3 == 0 && this.input % 5 == 0){
            return true;
        }else {
            return false;
        }
    }
}
