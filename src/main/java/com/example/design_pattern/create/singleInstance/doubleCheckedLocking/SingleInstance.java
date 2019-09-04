/**
 * Copyright (C), 2015-2019
 * FileName: ThreadUnsafe
 * Author:   r
 * Date:     2019-09-04 11:49
 */
package com.example.design_pattern.create.singleInstance.doubleCheckedLocking;

/**
 * 〈双检锁/双重校验锁-线程下安全〉
 * 采用双锁机制，安全且在多线程情况下能保持高性能。
 *
 * @author r
 * @version 1.0.0
 * @date 2019-09-04
 */
public class SingleInstance {

    private static volatile SingleInstance instance;

    private SingleInstance() {
    }

    //双锁，线程安全
    public static SingleInstance getInstance() {
        if (instance == null) {
            synchronized (SingleInstance.class) {
                if (instance == null) {
                    System.out.println("获取实例");
                    instance = new SingleInstance();
                }
            }
        }
        return instance;
    }

}
