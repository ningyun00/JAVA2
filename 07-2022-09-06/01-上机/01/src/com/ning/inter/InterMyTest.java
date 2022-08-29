package com.ning.inter;


import java.util.List;

/**
 * @Author 寜
 * @Date 2022-09-05
 * @Time 下午 02:21
 */
public interface InterMyTest {
    /**
     * 查询所有
     */
    List<Object> query();

    /**
     * 模糊查询
     */
    List<Object> queryLike(String str);

    /**
     * 根据编号查询
     */
    Object queryId(Integer id);
}
