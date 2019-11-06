package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    Integer numberToEval;
    public WuTangConcatenator(Integer input)
    {
        numberToEval = input;
    }

    public Boolean isWu() {
      //  if (numberToEval%3 == 0) return true; else return false;
        return numberToEval%3 == 0;

    }

    public Boolean isTang() {
        return numberToEval%5 == 0;
    }

    public Boolean isWuTang()
    {
       // if (isTang() && isWu()) return true; else return false;

        return (isTang() && isWu());
    }
}
