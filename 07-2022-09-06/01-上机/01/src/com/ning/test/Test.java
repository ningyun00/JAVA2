package com.ning.test;

import com.ning.entity.MyTest;
import com.ning.inter.InterMyTest;
import com.ning.inter.impl.ImplMyTest;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @Author 寜
 * @Date 2022-09-05
 * @Time 下午 02:41
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //反射类
        Class<ImplMyTest> classImplMyTest = ImplMyTest.class;
        //创建对象
        Object implMyTest = classImplMyTest.newInstance();
        //获取方法
        Method method = classImplMyTest.getMethod("query");
        List<MyTest> myTestList = (List<MyTest>) method.invoke(implMyTest);
        System.out.println(myTestList);
        System.out.println("===========================");
        method = classImplMyTest.getMethod("queryLike", String.class);
        myTestList = (List<MyTest>) method.invoke(implMyTest, "号");
        System.out.println(myTestList);
        System.out.println("===========================");
        method = classImplMyTest.getMethod("queryId", Integer.class);
        MyTest myTest =(MyTest) method.invoke(implMyTest, 1);
        System.out.println(myTest);
    }
}
