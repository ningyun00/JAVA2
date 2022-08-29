package com.ning;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 寜
 * @date 2022-08-28
 * @time 上午 10:48
 */
public class Test {
    public static void main(String[] args) {
        Date date = new Timestamp(System.currentTimeMillis());
        System.out.println(date);
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY年MM月dd日");
        System.out.println(simpleDateFormat.format(date));
        System.out.println(date1.getTime());
    }
}
