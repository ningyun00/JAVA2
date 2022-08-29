package com.ning.mapper;

import com.ning.entity.MyTest;

import java.util.List;

/**
 * @Author 寜
 * @Date 2022-09-06
 * @Time 下午 02:01
 */
public interface MyTestMapper {
    /**
     * 查询所有
     */
    List<MyTest> query();
}
