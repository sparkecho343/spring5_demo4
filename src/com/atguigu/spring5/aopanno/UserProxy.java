package com.atguigu.spring5.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author kasio
 * @create 2022-01-02 15:21
 */
//增强的类
@Component
@Aspect     //生成代理对象
@Order(3)
public class UserProxy {
    /**
     * 从Spring5.2.7开始，改成了根据其类型按照从高到低的优先级进行执行：
     * @Around，@Before，@AfterReturning，@AfterThrowing，@After，@Around。
     */

    //相同切入点抽取
    @Pointcut(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void pointCut(){

    }
    //前置通知
    //@Before注解表示作为前置通知
    @Before(value = "pointCut()")
    public void before() {
        System.out.println("before.....");
    }

    //后置通知
    @AfterReturning(value = "pointCut()")
    public void afterReturning() {
        System.out.println("AfterReturning.....");
    }

    //最终通知
    @After(value = "pointCut()")
    public void after() {
        System.out.println("After.....");
    }

    //异常通知
    @AfterThrowing(value = "pointCut()")
    public void afterThrowing() {
        System.out.println("AfterThrowing.....");
    }

    //环绕通知
    @Around(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前.....");
        //被增强的方法执行
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后.....");
    }
}
