package com.ning.test;

import com.ning.entity.MyTest;
import com.ning.inter.impl.ImplDao;
import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.Method;
import java.util.List;

/**
 * @author 寜
 * @date 2022-09-02
 * @time 下午 04:00
 */
public class Test {
    private static Class c = ImplDao.class;

    public static void main(String[] args) throws Exception {
        Class c = ImplDao.class;
        //MyTest对象
        Object o = c.newInstance();
        //查询所有方法
        Method select = c.getMethod("select");
        List<MyTest> myTestList = (List<MyTest>) select.invoke(o);
        System.out.println(myTestList);
        //查询单条
        select = c.getMethod("select", Integer.class);
        MyTest myTest = (MyTest) select.invoke(o, 1);
        System.out.println(myTest);
        //删除单条
        Method delete = c.getMethod("deleteId", Integer.class);
        int row = (int) delete.invoke(o, 7);
        if (row > 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
        //添加
        Method insert = c.getMethod("insert", Object.class);
        row = (int) insert.invoke(o, new MyTest(null, "P", "J", 10f));
        if (row > 0) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
        //修改
        Method updateId = c.getMethod("updateId", Object.class);
        row = (int) updateId.invoke(o, new MyTest(1, "2", "3", 10f));
        if (row > 0) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }
        getCommit();
    }

    private static void getCommit() throws Exception {
        Method sqlSessionMethod = c.getMethod("getSqlSession");
        SqlSession sqlSession = (SqlSession) sqlSessionMethod.invoke(c);
        sqlSession.commit();
        sqlSession.close();
    }
}