package com.ning.entity;

import com.ning.inter.IPayMethod;

/**
 * @author 寜
 * @date 2022-08-30
 * @time 下午 10:47
 */
public class UnionPayMethod implements IPayMethod {

    @Override
    public void prePay() {
        System.out.println("UnionPayMethod,prePay");
    }

    @Override
    public void pay() {
        System.out.println("UnionPayMethod,pay");
    }

    @Override
    public void afterPay() {
        System.out.println("UnionPayMethod,afterPay");
    }

}
