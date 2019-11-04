package com.zipcodewilmington.assessment2.part1;

import com.j256.ormlite.stmt.query.In;

public class WuTangConcatenator {
    public Integer input;
    public WuTangConcatenator(Integer input) {
    this.input = input;

    }

    public Boolean isWu() {

        if (input % 3 == 0)
        {   return true;
            }
        else {return false;}
    }

    public Boolean isTang() {

        if (input % 5 == 0) {
            return true;
        }
        else {return false;}
    }

    public Boolean isWuTang () {

        if (isWu() ==true && isTang() == true){
                return true;
                }
                return false;
    }
}
