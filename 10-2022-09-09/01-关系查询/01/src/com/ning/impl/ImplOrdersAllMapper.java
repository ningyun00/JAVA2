package com.ning.impl;

import com.ning.entity.Orders;
import com.ning.entity.Users;
import com.ning.mapper.OrdersMapper;
import com.ning.mapper.UsersMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * @Author 寜
 * @Date 2022-09-07
 * @Time 下午 04:06
 */
public class ImplOrdersAllMapper implements OrdersMapper, UsersMapper {
    private SqlSessionFactory getSqlSessionFactory() {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = ImplOrdersAllMapper.class.getClassLoader().getResourceAsStream("testConfiguration.xml");
        return sqlSessionFactoryBuilder.build(inputStream);
    }
    @Override
    public List<Orders> query() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);
        List<Orders> ordersList = ordersMapper.query();
        sqlSession.close();
        return ordersList;
    }
    @Override
    public List<Orders> findAll() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        OrdersMapper ordersAllMapper = sqlSession.getMapper(OrdersMapper.class);
        List<Orders> ordersAllMapperAll = ordersAllMapper.findAll();
        sqlSession.close();
        return ordersAllMapperAll;
    }

    @Override
    public List<Users> findOrders() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);
        List<Users> usersList = ordersMapper.findOrders();
        sqlSession.close();
        return usersList;
    }

    @Override
    public List<Users> UsersFindRole() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        UsersMapper mapper = sqlSession.getMapper(UsersMapper.class);
        List<Users> usersList = mapper.UsersFindRole();
        sqlSession.close();
        return usersList;
    }
}
