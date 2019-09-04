/**
 * Copyright (C), 2015-2019
 * FileName: ThreadUnsafe
 * Author:   r
 * Date:     2019-09-04 11:49
 */
package com.example.design_pattern.create.singleInstance.lazyThreadUnsafe;

/**
 * 〈懒汉模式-单线程下安全〉
 *  加锁
 * @author r
 * @version 1.0.0
 * @date 2019-09-04
 */
public class SingleInstance {

    private static SingleInstance instance;

    private SingleInstance() { }

    //未加锁，单线程安全
    public static SingleInstance getInstance() {
        if (instance == null) {
            System.out.println("获取实例");
            instance = new SingleInstance();
        }
        return instance;
    }

}
