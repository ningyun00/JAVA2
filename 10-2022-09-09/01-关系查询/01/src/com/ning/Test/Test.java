package com.ning.Test;

import com.ning.impl.ImplOrdersAllMapper;

/**
 * @Author 寜
 * @Date 2022-09-07
 * @Time 下午 04:07
 */
public class Test {
    public static void main(String[] args) {
        ImplOrdersAllMapper implOrdersAllMapper = new ImplOrdersAllMapper();
        System.out.println("查询全部");
        System.out.println(implOrdersAllMapper.query());
        System.out.println("根据地址查询用户");
        System.out.println(implOrdersAllMapper.findAll());
        System.out.println("根据用户查询地址");
        System.out.println(implOrdersAllMapper.findOrders());
        System.out.println("根据用户查询职务");
        System.out.println(implOrdersAllMapper.UsersFindRole());
    }
}
