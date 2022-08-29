package com.ning.test;

import com.ning.dao.Dao;
import com.ning.entity.MyTest;

import java.io.InputStream;
import java.util.List;
import java.util.Properties;

/**
 * @author 寜
 * @date 2022-08-29
 * @time 下午 04:31
 */
public class Test {
    private static Properties properties = new Properties();

    public static void main(String[] args) throws Exception {
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("test.properties");
        properties.load(inputStream);
        Class cm = Class.forName(properties.getProperty("className"));
        Dao dao = new Dao();
        List list = dao.select(cm);
        System.out.println(list);
    }
}
