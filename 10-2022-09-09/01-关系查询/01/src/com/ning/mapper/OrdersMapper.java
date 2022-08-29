package com.ning.mapper;

import com.ning.entity.Orders;
import com.ning.entity.Users;

import java.util.List;

/**
 * @Author 寜
 * @Date 2022-09-07
 * @Time 下午 03:42
 */
public interface OrdersMapper {
    /**
     * 查询所有
     */
    List<Orders> query();

    /**
     * 根据地址查询用户
     */
    List<Orders> findAll();

    /**
     * 根据用户查询地址
     */
    List<Users> findOrders();
}
