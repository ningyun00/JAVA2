package com.ning.mapper;

import com.ning.entity.Users;

import java.util.List;

/**
 * @Author 寜
 * @Date 2022-09-07
 * @Time 下午 09:11
 */
public interface UsersMapper {
    /**
     * 一对一，根据用户查询类别
     */
    List<Users> usersFindType();

    /**
     * 一对多，根据用户查看类别
     */
    List<Users> usersFindTypes();
}
