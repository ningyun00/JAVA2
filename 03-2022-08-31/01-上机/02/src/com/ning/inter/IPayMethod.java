package com.ning.inter;

/**
 * @author 寜
 * @date 2022-08-30
 * @time 下午 10:41
 */
public interface IPayMethod {
    void prePay();

    void pay();

    void afterPay();
}
