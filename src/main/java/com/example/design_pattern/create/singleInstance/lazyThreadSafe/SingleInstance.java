/**
 * Copyright (C), 2015-2019
 * FileName: ThreadUnsafe
 * Author:   r
 * Date:     2019-09-04 11:49
 */
package com.example.design_pattern.create.singleInstance.lazyThreadSafe;

/**
 * 〈懒汉模式-多线程下安全〉
 *
 * @author r
 * @version 1.0.0
 * @date 2019-09-04
 */
public class SingleInstance {

    private static SingleInstance instance;

    private SingleInstance() { }

    //加锁，多线程安全，单效率会受到影响
    public static synchronized SingleInstance getInstance() {
        if (instance == null) {
            System.out.println("获取实例");
            instance = new SingleInstance();
        }
        return instance;
    }

}
