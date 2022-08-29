package com.ning.mapper;

import com.ning.entity.MyTest;

import java.util.List;

/**
 * @Author 寜
 * @Date 2022-09-05
 * @Time 下午 09:33
 */
public interface MyTestMapper {
    /**
     * 查询所有
     */
    List<MyTest> queryMyTest();

    /**
     * 根据id查询
     */
    MyTest queryIdMyTest(Integer id);

    /**
     * 根据姓名模糊查询
     */
    List<MyTest> queryLikeMyTest(String str);

    /**
     * 添加
     */
    Integer insertMyTest(MyTest myTest);

    /**
     * 根据id修改
     */
    Integer updateMyTest(MyTest myTest);

    /**
     * 根据id删除
     */
    Integer deleteIdMyTest(Integer id);
}
