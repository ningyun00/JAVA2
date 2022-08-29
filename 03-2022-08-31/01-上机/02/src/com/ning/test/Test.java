package com.ning.test;

import com.ning.entity.InternationalPayMethod;
import com.ning.entity.UnionPayMethod;
import com.ning.entity.WechatPayMethod;
import com.ning.entity.ZfbPayMethod;
import com.ning.enums.IPayMethodEnum;
import com.ning.inter.IPayMethod;

/**
 * @author 寜
 * @date 2022-08-30
 * @time 下午 10:35
 */
public class Test {
    /*作业二：用工厂模式设计支付业务场景，包含跨境支付，支付宝、微信、银联支付
    1、创建一个IPayMethod 支付方式的接口，有三个抽象方法prePay、pay、afterPay
    2、创建四个类(InternationalPayMethod、ZfbPayMethod、WechatPayMethod、UnionPayMethod、)实现IPayMethod 接口，同时重写方法三个方法
    3、创建测试类，注意测试类不直接和四个实现类有关联，不能测试类中创建对象，要求使用工厂模式的方式创建四个类的对象
    */
    public IPayMethod PayMethod(IPayMethodEnum iPayMethodEnum) {
        if (iPayMethodEnum == IPayMethodEnum.InternationalPayMethod) {
            return new InternationalPayMethod();
        } else if (iPayMethodEnum == IPayMethodEnum.UnionPayMethod) {
            return new UnionPayMethod();
        } else if (iPayMethodEnum == IPayMethodEnum.WechatPayMethod) {
            return new WechatPayMethod();
        } else if (iPayMethodEnum == IPayMethodEnum.ZfbPayMethod) {
            return new ZfbPayMethod();
        } else {
            return null;
        }
    }

    @org.junit.Test
    public void test() {
        IPayMethod iPayMethod = PayMethod(IPayMethodEnum.ZfbPayMethod);
        iPayMethod.pay();
        iPayMethod.prePay();
        iPayMethod.afterPay();
    }
}
