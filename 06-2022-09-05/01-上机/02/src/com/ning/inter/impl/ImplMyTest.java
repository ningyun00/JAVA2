package com.ning.inter.impl;

import com.ning.inter.InterMyTest;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * @Author 寜
 * @Date 2022-09-04
 * @Time 下午 10:54
 */
public class ImplMyTest implements InterMyTest {
    private static SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
    private static InputStream inputStream = InterMyTest.class.getClassLoader().getResourceAsStream("configuration.xml");
    private static SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);

    @Override
    public List<Object> query() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Object> list = sqlSession.selectList("test.query");
        sqlSession.commit();
        sqlSession.close();
        return list;
    }

    @Override
    public Integer insert(Object o) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Integer integer = sqlSession.insert("test.insert", o);
        sqlSession.commit();
        sqlSession.close();
        return integer;
    }
}
