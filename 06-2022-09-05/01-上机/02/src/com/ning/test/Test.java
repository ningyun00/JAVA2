package com.ning.test;

import com.ning.entity.MyTest;
import com.ning.inter.impl.ImplMyTest;

import java.lang.reflect.Method;
import java.util.List;

/**
 * @Author 寜
 * @Date 2022-09-04
 * @Time 下午 10:47
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Class classMyTest = ImplMyTest.class;
        Object myTest = classMyTest.newInstance();
        Method query = classMyTest.getMethod("query");
        List<MyTest> myTestList = (List<MyTest>) query.invoke(myTest);
        System.out.println(myTestList);
        Method insert = classMyTest.getMethod("insert", Object.class);
        int row = (int)insert.invoke(myTest,new MyTest(null,"2","2",1f));
        if (row>0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }
}
