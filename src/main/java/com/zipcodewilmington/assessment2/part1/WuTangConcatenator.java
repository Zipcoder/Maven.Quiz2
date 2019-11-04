package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

    private Integer wu = 3;
    private Integer tang = 5;
    private Integer wuTang = 15;
    private Boolean wuTruth = false;
    private Boolean tangTruth = false;
    private Boolean wuTangTruth = false;

    public WuTangConcatenator(Integer input) {
        if(input % wu == 0)
            this.wuTruth = true;
        if(input % tang == 0)
            this.tangTruth = true;
        if(input % wuTang == 0)
            this.wuTangTruth = true;
    }

    public Boolean isWu() {
        return wuTruth;
    }

    public Boolean isTang() {
        return tangTruth;
    }

    public Boolean isWuTang() {
        return wuTangTruth;
    }
}
