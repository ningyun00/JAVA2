package com.ning.impl;

import com.ning.entity.MyTest;
import com.ning.mapper.MyTestMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 寜
 * @Date 2022-09-06
 * @Time 下午 02:58
 */
public class ImplMyTest<T> implements MyTestMapper {
    private SqlSessionFactory getSqlSessionFactory() {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = ImplMyTest.class.getClassLoader().getResourceAsStream("MyTestConfiguration.xml");
        return sqlSessionFactoryBuilder.build(inputStream);
    }

    @Override
    public List<MyTest> query() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        MyTestMapper myTestMapper = sqlSession.getMapper(MyTestMapper.class);
        List<MyTest> myTestList = myTestMapper.query();
        sqlSession.close();
        return myTestList;
    }
    @Override
    public List<MyTest> querys(Integer... args) {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        MyTestMapper myTestMapper = sqlSession.getMapper(MyTestMapper.class);
        List<MyTest> myTestList = myTestMapper.querys(args);
        sqlSession.close();
        return myTestList;
    }

    @Override
    public MyTest queryId(Integer id) {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        MyTestMapper myTestMapper = sqlSession.getMapper(MyTestMapper.class);
        MyTest myTest = myTestMapper.queryId(id);
        sqlSession.close();
        return myTest;
    }

    @Override
    public Integer deleteIds(Integer... args) {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        MyTestMapper myTestMapper = sqlSession.getMapper(MyTestMapper.class);
        Integer row = myTestMapper.deleteIds(args);
        sqlSession.commit();
        sqlSession.close();
        return row;
    }

    @Override
    public Integer deleteId(Integer id) {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        MyTestMapper myTestMapper = sqlSession.getMapper(MyTestMapper.class);
        Integer row = myTestMapper.deleteId(id);
        sqlSession.commit();
        sqlSession.close();
        return row;
    }

    @Override
    public Integer updateId(MyTest myTest) {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        MyTestMapper myTestMapper = sqlSession.getMapper(MyTestMapper.class);
        Integer row = myTestMapper.updateId(myTest);
        sqlSession.close();
        return row;
    }
}
