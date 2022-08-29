package com.ning.dao;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 寜
 * @date 2022-08-29
 * @time 下午 07:41
 */
public class Dao {
    private static Connection connection = null;
    private static PreparedStatement preparedStatement = null;
    private static ResultSet resultSet = null;
    private static BaseDao baseDao = new BaseDao();
    private static StringBuffer sql = null;
    private static Integer row = 0;

    public List select(Class c) {
        List list = new ArrayList();
        try {
            connection = baseDao.getConnection();
            sql = new StringBuffer("SELECT * FROM " + c.getSimpleName());
            preparedStatement = connection.prepareStatement(sql.toString());
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Object object = c.newInstance();
                for (Field field : c.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object o = resultSet.getObject(field.getName());
                    field.set(object, o);
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

    public Integer add(Object object) {
        try {
            row = 0;
            connection = baseDao.getConnection();
            Class c = object.getClass();
            sql = new StringBuffer("INSERT INTO " + c.getSimpleName() + " VALUES(");
            for (Field field : c.getDeclaredFields()) {
                field.setAccessible(true);
                if (field.get(object) == null) {
                    sql.append(field.get(object) + ",");
                }
                if (field.get(object) != null) {
                    sql.append("'" + field.get(object) + "',");
                }
            }
            sql.delete(sql.lastIndexOf(","), sql.length()).append(")");
            preparedStatement = connection.prepareStatement(sql.toString());
            row = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            baseDao.close(null, preparedStatement, connection);
        }
        return row;
    }

    public Integer delete(BigDecimal id, Class c) {
        try {
            row = 0;
            connection = baseDao.getConnection();
            sql = new StringBuffer("DELETE FROM " + c.getSimpleName() + " where " + c.getDeclaredFields()[0].getName() + "=" + id);
            preparedStatement = connection.prepareStatement(sql.toString());
            row = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            baseDao.close(null, preparedStatement, connection);
        }
        return row;
    }

    public Integer update(Object object) {
        try {
            row = 0;
            connection = baseDao.getConnection();
            Class<?> c = object.getClass();
            StringBuffer sql = new StringBuffer("update " + c.getSimpleName() + " set ");
            Field[] fields = c.getDeclaredFields();
            Field.setAccessible(fields, true);
            for (int i = 0; i < fields.length; i++) {
                sql.append(fields[i].getName() + "=?");
                if (i < fields.length - 1) {
                    sql.append(",");
                }
            }
            sql.append(" where " + fields[0].getName() + "=" + fields[0].get(object));
            System.out.println(sql);
            preparedStatement = connection.prepareStatement(sql.toString());
            for (int i = 0; i < fields.length; i++) {
                preparedStatement.setObject(i+1, fields[i].get(object));
            }
            System.out.println(sql);
            row = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            baseDao.close(null, preparedStatement, connection);
        }
        return row;
    }
}
