package com.ning.inter.impl;

import com.ning.inter.InterMyTest;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/**
 * @Author 寜
 * @Date 2022-09-05
 * @Time 下午 02:22
 */
public class ImplMyTest implements InterMyTest {

    private SqlSessionFactory getSqlSessionFactory() {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = InterMyTest.class.getClassLoader().getResourceAsStream("configuration.xml");
        return sqlSessionFactoryBuilder.build(inputStream);
    }

    //查询所有
    @Override
    public List<Object> query() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        List<Object> myTestList = sqlSession.selectList("test.query");
        sqlSession.close();
        return myTestList;
    }

    //模糊查询
    @Override
    public List<Object> queryLike(String str) {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        List<Object> myTestList = sqlSession.selectList("test.queryLike", "%" + str + "%");
        sqlSession.close();
        return myTestList;
    }

    @Override
    public Object queryId(Integer id) {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        Object myTestList = sqlSession.selectOne("test.queryId", id);
        sqlSession.close();
        return myTestList;
    }
}
