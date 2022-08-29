package com.ning.test;

import com.ning.dao.DaoMyTest;
import com.ning.entity.MyTest;

/**
 * @Author 寜
 * @Date 2022-09-05
 * @Time 下午 09:31
 */
public class Test {
    public static void main(String[] args) {
        DaoMyTest daoMyTest = new DaoMyTest();
        System.out.println(daoMyTest.queryMyTest());
        System.out.println(daoMyTest.queryIdMyTest(1));
        System.out.println(daoMyTest.queryLikeMyTest("号"));
        System.out.println(daoMyTest.insertMyTest(new MyTest(null, "2", "3", 1f)));
        MyTest myTest = new MyTest();
        myTest.setId(1);
        myTest.setName("2");
        System.out.println(daoMyTest.updateMyTest(myTest));
        System.out.println(daoMyTest.deleteIdMyTest(17));
    }
}
