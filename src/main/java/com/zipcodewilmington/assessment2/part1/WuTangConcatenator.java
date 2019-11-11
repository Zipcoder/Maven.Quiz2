package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

    Integer input;

    public WuTangConcatenator(Integer input) {
        this.input = input;
    }
//testing the length? wutang is 6 letters
    //return true or false

    //After reading the readMe and reviewing the test I still am unsure of what I'm being asked to do.
    public Boolean isWu() {


        return input % 3 == 0;
    }

    public Boolean isTang() {
        return input % 5 == 0;
    }

    public Boolean isWuTang() {
        return input % 3 == 0 && input % 5 == 0;
    }
}
