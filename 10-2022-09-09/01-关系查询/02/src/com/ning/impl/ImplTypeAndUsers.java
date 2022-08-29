package com.ning.impl;

import com.ning.entity.Users;
import com.ning.mapper.UsersMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * @Author 寜
 * @Date 2022-09-07
 * @Time 下午 09:12
 */
public class ImplTypeAndUsers implements UsersMapper {

    private SqlSessionFactory getSqlSessionFactory(){
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = ImplTypeAndUsers.class.getClassLoader().getResourceAsStream("testConfiguration.xml");
        return sqlSessionFactoryBuilder.build(inputStream);
    }
    @Override
    public List<Users> usersFindType() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        List<Users> usersList = usersMapper.usersFindType();
        sqlSession.close();
        return usersList;
    }

    @Override
    public List<Users> usersFindTypes() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        List<Users> usersList = usersMapper.usersFindTypes();
        sqlSession.close();
        return usersList;
    }
}
