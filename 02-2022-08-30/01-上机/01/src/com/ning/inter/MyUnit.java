package com.ning.inter;

import java.lang.annotation.*;

/*
        作业一：
    模拟完成Junit的@Test的使用
    步骤：
    模拟Junit测试的注释@Test
    1.首先需要编写自定义注解@MyUnit，并添加元注解，保证自定义注解 只能修饰方法，且在运行时可以获得。
    2. 然后编写目标类（测试类），然后给目标方法（测试方法）,编写三个方法, 使用@MyUnit注解， 其中两个加上@MyUnit注解。
    3. 最后编写调用类，使用main方法调用目标类，模拟Junit的运行，只要有@MyUnit注释的方法都会 运行。
    */
/*自定义注解*/
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface MyUnit {
    String name();
    int age() default 18;
    char sex() default '女';
}
