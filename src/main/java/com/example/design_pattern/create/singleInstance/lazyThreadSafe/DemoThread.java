/**
 * Copyright (C), 2015-2019
 * FileName: DemoThread
 * Author:   r
 * Date:     2019-09-04 13:52
 */
package com.example.design_pattern.create.singleInstance.lazyThreadSafe;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 〈单例模式线程〉
 *
 * @author r
 * @version 1.0.0
 * @date 2019-09-04
 */
public class DemoThread extends Thread {
    //set不能存放重复的元素
    public Set<SingleInstance> set = new HashSet<>();

    @Override
    public void run() {
        SingleInstance instance = SingleInstance.getInstance();
        set.add(instance);
        System.out.println(new Date().toInstant().toString() + " " + Thread.currentThread().getName() + ":set size is " + set.size());
    }
}
