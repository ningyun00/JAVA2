package com.ning.mapper;

import com.ning.entity.MyTest;

import java.util.List;

/**
 * @Author 寜
 * @Date 2022-09-06
 * @Time 下午 02:52
 */
public interface MyTestMapper {
    /**
     * 查询所有
     */
    List<MyTest> query();

    /**
     * 批量查询
     */
    List<MyTest> querys(Integer... args);

    /**
     * 根据id查询
     */
    MyTest queryId(Integer id);

    /**
     * 批量删除
     */
    Integer deleteIds(Integer... args);

    /**
     * 单条删除
     */
    Integer deleteId(Integer id);

    /**
     * 根据id修改
     */
    Integer updateId(MyTest myTest);
}
