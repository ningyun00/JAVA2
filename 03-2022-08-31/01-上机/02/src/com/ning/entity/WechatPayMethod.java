package com.ning.entity;

import com.ning.inter.IPayMethod;

/**
 * @author 寜
 * @date 2022-08-30
 * @time 下午 10:47
 */
public class WechatPayMethod implements IPayMethod {

    @Override
    public void prePay() {
        System.out.println("WechatPayMethod,prePay");
    }

    @Override
    public void pay() {
        System.out.println("WechatPayMethod,pay");
    }

    @Override
    public void afterPay() {
        System.out.println("WechatPayMethod,afterPay");
    }

}
