package com.ning.test;

import com.ning.dao.BaseDao;
import com.ning.dao.Dao;
import com.ning.entity.Emp;

import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;

/**
 * @author 寜
 * @date 2022-08-29
 * @time 下午 07:33
 */
public class Test {
    public static Properties properties = new Properties();
    public static Dao dao = new Dao();
    public static void main(String[] args) throws Exception {
        InputStream empTable = Test.class.getClassLoader().getResourceAsStream("entity.properties");
        properties.load(empTable);
        Class className = Class.forName(properties.getProperty("classNameEmp"));
        List list = dao.select(className);
        System.out.println(list);
        /*
        Emp emp = new Emp(new BigDecimal(10),"2","3",new BigDecimal(1),null,new BigDecimal(1),new BigDecimal(1),new BigDecimal(10));
        System.out.println(dao.add(emp));
        */
        /*System.out.println(dao.delete(new BigDecimal(1),className));*/
        Emp emp = new Emp(new BigDecimal(10),"21","3",new BigDecimal(1),null,new BigDecimal(1),new BigDecimal(1),new BigDecimal(10));
        System.out.println(dao.update(emp));
    }
}