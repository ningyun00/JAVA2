package com.ning.inter;

import java.util.List;

/**
 * @author 寜
 * @date 2022-09-02
 * @time 下午 04:18
 */
public interface InterDao {
    //查询所有
    List<Object> select();

    //根据id查询
    Object select(Integer id);

    //根据id删除
    Integer deleteId(Integer id);

    //添加单条数据
    Integer insert(Object o);

    //根据编号修改
    Integer updateId(Object o);
}
