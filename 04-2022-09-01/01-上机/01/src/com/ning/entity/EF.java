package com.ning.entity;

import com.ning.inter.InterEF;

/**
 * @author 寜
 * @date 2022-08-31
 * @time 下午 03:09
 */
public class EF implements InterEF {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EF(String name) {
        this.name = name;
    }

    @Override
    public void onADate() {
        System.out.println(this.name+"找媒婆");
    }

    @Override
    public void eat() {
        System.out.println(this.name+"吃饭");
    }
}
