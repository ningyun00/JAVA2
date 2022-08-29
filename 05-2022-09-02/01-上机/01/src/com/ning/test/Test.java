package com.ning.test;

import com.ning.inter.InterML;

/**
 * @author 寜
 * @date 2022-09-01
 * @time 下午 11:37
 */
public class Test {
    public static void main(String[] args) {
        InterML interML = ()->{
            System.out.println();
        };
        interML.as();
        new Thread(()->{
            System.out.println("你好");
        }).start();
        Runnable runnable = ()-> {
            System.out.println("1");
        };
        runnable.run();
    }
}
