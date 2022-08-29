package com.ning.test;

import com.ning.entity.Users;
import com.ning.mapper.UsersMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * @Author 寜
 * @Date 2022-09-08
 * @Time 下午 02:40
 */
public class Test {
    public static void main(String[] args) {
        Dao  dao = new Dao();
        List<Users> usersList = dao.userFindType();
       for(Users u :usersList ){
           System.out.println(u);
           System.out.println(u.getTypes());
       }
    }
}

class Dao implements UsersMapper {
    private SqlSessionFactory getSqlSessionFactory() {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = Dao.class.getClassLoader().getResourceAsStream("testConfiguration.xml");
        return sqlSessionFactoryBuilder.build(inputStream);
    }

    @Override
    public List<Users> userFindType() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        List<Users> usersList = usersMapper.userFindType();
        sqlSession.close();
        return usersList;
    }

    @Override
    public List<Users> userFindTypes() {
        return null;
    }
}
