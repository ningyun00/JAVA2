package com.ning.inter;

import java.util.List;

/**
 * @Author 寜
 * @Date 2022-09-04
 * @Time 下午 10:54
 */
public interface InterMyTest {
    //查询所有
    List<Object> query();
    //添加
    Integer insert(Object o);
}
