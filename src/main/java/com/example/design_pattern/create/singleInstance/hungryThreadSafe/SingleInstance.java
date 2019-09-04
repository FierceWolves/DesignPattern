/**
 * Copyright (C), 2015-2019
 * FileName: ThreadUnsafe
 * Author:   r
 * Date:     2019-09-04 11:49
 */
package com.example.design_pattern.create.singleInstance.hungryThreadSafe;

/**
 * 〈饿汉式-线程安全〉
 *
 * @author r
 * @version 1.0.0
 * @date 2019-09-04
 */
public class SingleInstance {
    //类加载时，进行实例化
    private static SingleInstance instance = new SingleInstance();

    private SingleInstance() {
    }

    //未使用到懒加载，类加载时就初始化，浪费内存。
    public static SingleInstance getInstance() {
        return instance;
    }

}
