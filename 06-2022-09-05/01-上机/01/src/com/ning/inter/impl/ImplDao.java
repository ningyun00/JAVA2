package com.ning.inter.impl;

import com.ning.inter.InterDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * @author 寜
 * @date 2022-09-02
 * @time 下午 04:39
 */
public class ImplDao implements InterDao {
    private static InputStream inputStream = ImplDao.class.getClassLoader().getResourceAsStream("MysqlMapConfig.xml");
    private static SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    private static SqlSession sqlSession = sqlSessionFactory.openSession();

    public static SqlSession getSqlSession() {
        return sqlSession;
    }

    @Override
    public List<Object> select() {
        sqlSession = sqlSessionFactory.openSession();
        return sqlSession.selectList("test.queryAll");
    }

    @Override
    public Object select(Integer id) {
        sqlSession = sqlSessionFactory.openSession();
        return sqlSession.selectOne("test.queryId", id);
    }

    @Override
    public Integer deleteId(Integer id) {
        sqlSession = sqlSessionFactory.openSession();
        return sqlSession.delete("test.deleteId", id);
    }

    @Override
    public Integer insert(Object o) {
        sqlSession = sqlSessionFactory.openSession();
        return sqlSession.insert("test.insert", o);
    }

    @Override
    public Integer updateId(Object o) {
        sqlSession = sqlSessionFactory.openSession();
        return sqlSession.update("test.updateId", o);
    }
}
