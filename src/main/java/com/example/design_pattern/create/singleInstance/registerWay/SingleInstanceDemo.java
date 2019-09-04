/**
 * Copyright (C), 2015-2019
 * FileName: SingleInstance
 * Author:   r
 * Date:     2019-09-04 12:32
 */
package com.example.design_pattern.create.singleInstance.registerWay;

import java.util.Date;

/**
 * 〈单例模式〉
 *
 * @author r
 * @version 1.0.0
 * @date 2019-09-04
 */
public class SingleInstanceDemo {
    public static void main(String[] args) {
        DemoThread demoThread = new DemoThread();
        long startTime = new Date().getTime();
        new Thread(demoThread).start();
        new Thread(demoThread).start();
        new Thread(demoThread).start();
        new Thread(demoThread).start();
        new Thread(demoThread).start();
        new Thread(demoThread).start();
        new Thread(demoThread).start();
        new Thread(demoThread).start();
        new Thread(demoThread).start();
        long endTime = new Date().getTime();
        System.out.println("执行时间:"+(endTime-startTime));
    }
}

