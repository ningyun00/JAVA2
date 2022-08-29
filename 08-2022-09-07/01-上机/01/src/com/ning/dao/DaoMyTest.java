package com.ning.dao;

import com.ning.entity.MyTest;
import com.ning.mapper.MyTestMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * @Author 寜
 * @Date 2022-09-05
 * @Time 下午 09:57
 */
public class DaoMyTest implements MyTestMapper {
    private SqlSessionFactory getSqlSessionFactory() {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = DaoMyTest.class.getClassLoader().getResourceAsStream("myTestConfiguration.xml");
        return sqlSessionFactoryBuilder.build(inputStream);
    }

    @Override
    public List<MyTest> queryMyTest() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        MyTestMapper myTestMapper = sqlSession.getMapper(MyTestMapper.class);
        List<MyTest> myTestList = myTestMapper.queryMyTest();
        sqlSession.close();
        return myTestList;
    }

    @Override
    public MyTest queryIdMyTest(Integer id) {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        MyTestMapper myTestMapper = sqlSession.getMapper(MyTestMapper.class);
        MyTest myTest = myTestMapper.queryIdMyTest(id);
        sqlSession.close();
        return myTest;
    }

    @Override
    public List<MyTest> queryLikeMyTest(String str) {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        MyTestMapper myTestMapper = sqlSession.getMapper(MyTestMapper.class);
        List<MyTest> myTestList = myTestMapper.queryLikeMyTest("%" + str + "%");
        sqlSession.close();
        return myTestList;
    }

    @Override
    public Integer insertMyTest(MyTest myTest) {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        MyTestMapper myTestMapper = sqlSession.getMapper(MyTestMapper.class);
        Integer insertMyTest = myTestMapper.insertMyTest(myTest);
        sqlSession.commit();
        sqlSession.close();
        return insertMyTest;
    }

    @Override
    public Integer updateMyTest(MyTest myTest) {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        MyTestMapper myTestMapper = sqlSession.getMapper(MyTestMapper.class);
        if (myTest.getName() == null) {
            myTest.setName(queryIdMyTest(myTest.getId()).getName());
        }
        if (myTest.getType()==null){
            myTest.setType(queryIdMyTest(myTest.getId()).getType());
        }
        if (myTest.getPrice()==null){
            myTest.setPrice(queryIdMyTest(myTest.getId()).getPrice());
        }
        Integer updateMyTest = myTestMapper.updateMyTest(myTest);
        sqlSession.commit();
        sqlSession.close();
        return updateMyTest;
    }

    @Override
    public Integer deleteIdMyTest(Integer id) {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        MyTestMapper myTestMapper = sqlSession.getMapper(MyTestMapper.class);
        Integer deleteIdMyTest = myTestMapper.deleteIdMyTest(id);
        sqlSession.commit();
        sqlSession.close();
        return deleteIdMyTest;
    }
}
