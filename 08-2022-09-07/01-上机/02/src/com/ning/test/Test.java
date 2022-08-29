package com.ning.test;

import com.ning.mapper.MyTestMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @Author 寜
 * @Date 2022-09-06
 * @Time 下午 02:00
 */
public class Test {
    public static void main(String[] args) {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("MyTestConfiguration.xml");
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        MyTestMapper myTestMapperInter = sqlSession.getMapper(MyTestMapper.class);
        System.out.println(myTestMapperInter.query());
    }
}
