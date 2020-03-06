package com.zipcodewilmington.assessment2.part1;

import com.j256.ormlite.stmt.query.In;

public class WuTangConcatenator {
    public WuTangConcatenator(Integer input) {

    }

    public Boolean isWu() {

//        if ( % 3 == 0){
//            return true;
//        }
//        return false;
        return null;
    }

    public Boolean isTang() {
//        if (input % 5 == 0){
//            return true;
//        }
//        return false;
        return null;
    }

    public Boolean isWuTang() {
        if (isWu() == true && isTang() == true){
            return true;
        }
        return false;
    }
}
