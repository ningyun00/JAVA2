package com.ning.mapper;

import com.ning.entity.Users;

import java.util.List;

/**
 * @Author 寜
 * @Date 2022-09-09
 * @Time 上午 08:51
 */
public interface UsersMapper {
    List<Users> userFindType();
    List<Users> userFindTypes();
}
