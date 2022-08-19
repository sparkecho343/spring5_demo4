package com.atguigu.spring5.aopanno;

import org.springframework.stereotype.Component;

/**
 * @author kasio
 * @create 2022-01-02 15:20
 */
//被增强的类
@Component
public class User {

    public void add(){
        int a = 10/0;
        System.out.println("add.......");
    }

}
