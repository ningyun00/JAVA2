package com.ning.entity;

import com.ning.inter.InterEF;

/**
 * @author 寜
 * @date 2022-08-31
 * @time 下午 03:45
 */
public class MP implements InterEF {
    private EF ef;

    public MP(EF ef) {
        this.ef = ef;
    }

    public EF getEf() {
        return ef;
    }

    public void setEf(EF ef) {
        this.ef = ef;
    }

    @Override
    public void onADate() {
        System.out.println("媒婆把关");
        ef.onADate();
    }

    @Override
    public void eat() {

    }
}
