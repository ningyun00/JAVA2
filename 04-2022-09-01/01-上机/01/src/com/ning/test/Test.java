package com.ning.test;

import com.ning.entity.EF;
import com.ning.entity.MP;
import com.ning.inter.InterEF;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 寜
 * @date 2022-08-31
 * @time 下午 03:11
 */
public class Test {
/*作业一：
完成”刘亦菲找媒婆”案例
接口(协议)：约会方法
委托者：刘亦菲
代理对象：媒婆
使用动态代理的方式完成”刘亦菲找媒婆”案例*/

    @org.junit.Test
    public void main() {
        EF ef = new EF("刘亦菲");
        MP mp = new MP(ef);
        mp.onADate();
    }

    @org.junit.Test
    public void main1() throws Exception {
        EF ef = new EF("刘亦菲");
        InterEF interEF = (InterEF) Proxy.newProxyInstance(EF.class.getClassLoader(), EF.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("doADate")) {
                    System.out.println("媒婆代理");
                    method.invoke(ef);
                }
                if (method.getName().equals("eat")){
                    System.out.println("媒婆代理");
                    method.invoke(ef);
                }
                return null;
            }
        });
        interEF.eat();
    }
}
