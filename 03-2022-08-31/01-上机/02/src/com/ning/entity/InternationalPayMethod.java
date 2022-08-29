package com.ning.entity;

import com.ning.inter.IPayMethod;

/**
 * @author 寜
 * @date 2022-08-30
 * @time 下午 10:47
 */
public class InternationalPayMethod implements IPayMethod {

    @Override
    public void prePay() {
        System.out.println("InternationalPayMethod,prePay");
    }

    @Override
    public void pay() {
        System.out.println("InternationalPayMethod,pay");
    }

    @Override
    public void afterPay() {
        System.out.println("InternationalPayMethod,afterPay");
    }
}
