package com.ning.entity;

import com.ning.inter.IPayMethod;

/**
 * @author 寜
 * @date 2022-08-30
 * @time 下午 10:47
 */
public class ZfbPayMethod implements IPayMethod {

    @Override
    public void prePay() {
        System.out.println("ZfbPayMethod,prePay");
    }

    @Override
    public void pay() {
        System.out.println("ZfbPayMethod,pay");
    }

    @Override
    public void afterPay() {
        System.out.println("ZfbPayMethod,afterPay");
    }

}
