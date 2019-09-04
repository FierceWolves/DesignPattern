/**
 * Copyright (C), 2015-2019
 * FileName: ThreadUnsafe
 * Author:   r
 * Date:     2019-09-04 11:49
 */
package com.example.design_pattern.create.singleInstance.registerWay;

/**
 * 〈登记式/静态内部类-线程安全〉
 *  达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。
 * @author r
 * @version 1.0.0
 * @date 2019-09-04
 */
public class SingleInstance {

    private static class SingletonHolder {
        private static final SingleInstance INSTANCE = new SingleInstance();
    }

    private SingleInstance() {
    }

    public static SingleInstance getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
