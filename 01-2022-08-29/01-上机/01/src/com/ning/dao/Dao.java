package com.ning.dao;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 寜
 * @date 2022-08-29
 * @time 下午 04:40
 */
public class Dao {
    private static Connection connection = null;
    private static PreparedStatement preparedStatement = null;
    private static ResultSet resultSet = null;
    private static BaseDao baseDao = new BaseDao();
    private static String sql = null;

    public List select(Class c) {
        List list = new ArrayList();
        try {
            connection = baseDao.getConnection();
            sql = "SELECT * FROM " + c.getSimpleName();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Object object = c.newInstance();
                for (Field f : c.getDeclaredFields()) {
                    f.setAccessible(true);
                    Object o = resultSet.getObject(f.getName());
                    f.set(object,o);
                }
                list.add(object);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            baseDao.close(resultSet, preparedStatement, connection);
        }
        return list;
    }
}
