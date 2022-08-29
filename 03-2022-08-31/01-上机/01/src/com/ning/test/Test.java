package com.ning.test;

import com.ning.enums.MianEnum;
import com.ning.enums.SexEnum;
import com.ning.inter.Mian;
import com.ning.mian.Mian1;
import com.ning.mian.Mian2;
import com.ning.mian.Mian3;

/**
 * @author 寜
 * @date 2022-08-30
 * @time 下午 09:57
 */
public class Test {
    /*作业一：将上课的案例重写一遍(注意：不是复制，要自己顺一遍)*/
    @org.junit.Test
    public void main() {
        System.out.println(SexEnum.female);
        SexEnum.male.showSex();
    }

    @org.junit.Test
    public void mian() {
        Mian mian = mianShow(MianEnum.Mian2);
        mian.mian();
    }

    public Mian mianShow(MianEnum mianEnum) {
        if (mianEnum == MianEnum.Mian1) {
            return new Mian1();
        }
        if (mianEnum == MianEnum.Mian2) {
            return new Mian2();
        }
        if (mianEnum == MianEnum.Mian3) {
            return new Mian3();
        }else {
            return null;
        }
    }
}
