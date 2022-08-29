package com.ning.test;

import com.ning.entity.MyTest;
import com.ning.impl.ImplMyTest;

import java.sql.SQLInput;

/**
 * @Author 寜
 * @Date 2022-09-06
 * @Time 下午 02:45
 */
public class Test {
    public static void main(String[] args) {
        ImplMyTest implMyTest = new ImplMyTest();
        System.out.println(implMyTest.query());
        System.out.println(implMyTest.queryId(1));
        System.out.println(implMyTest.querys(2,5,8));
    }
}
