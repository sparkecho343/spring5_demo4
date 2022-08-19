package com.atguigu.spring5;

/**
 * @author kasio
 * @create 2022-01-01 18:11
 */
public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        System.out.println("add的方法被执行了");
        return a+b;

    }

    @Override
    public String update(String id) {
        System.out.println("update的方法被执行了");
        return null;
    }
}
