package com.ning.entity;

import com.ning.inter.MyUnit;

/**
 * @author 寜
 * @date 2022-08-30
 * @time 下午 06:56
 */
@MyUnit(name = "寜1", age = 17, sex = '女')
public class User {
    @MyUnit(name = "寜1", age = 17, sex = '女')
    public void ning1() {
        System.out.println("UserNing1");
    }

    @MyUnit(name = "寜2", age = 17, sex = '女')
    public void ning2() {
        System.out.println("UserNing2");
    }

    public void ning3() {
        System.out.println("UserNing3");
    }
}
