package com.ning.entity;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 寜
 * @date 2022-08-31
 * @time 下午 10:08
 */
public class Lists {
    /*作业二：
使用动态代理方式
 对List接口进行代理，以前的remove(Object obj)方法是删除集合中第一次出现的元素(比如集合中有多个“abc”,调用remove(“abc”)后只会删除一个元素)。
 代理后，要求在调用remove(Object obj)方法后，能够删除集合中所有匹配的元素。【动态代理】
*/
    @Test
    public void main() throws Exception {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(1);
        list.add("1");
        list.add(1);
        list.add(2);
        list.add("1");
        list.add(1);
        list.add("啊水水");
        list.add(1);
        list.add(1);
        list.add("2");
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println("输出前：" + list);
        List A = (List) Proxy.newProxyInstance(
                ArrayList.class.getClassLoader(),
                ArrayList.class.getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
                        if ("remove".equals(method.getName())) {
                            Iterator iterator = list.iterator();
                            while (iterator.hasNext()){
                                if (iterator.next().equals(args[0])){
                                    iterator.remove();
                                }
                            }
                            list.removeIf(l -> args[0].equals(l));

                        }
                        return method.invoke(list, args);
                    }
                }
        );
        A.remove("1");
        System.out.println("输出后：" + list);
    }
}
