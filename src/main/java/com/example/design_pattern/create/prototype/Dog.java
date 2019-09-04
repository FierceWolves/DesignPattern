/**
 * Copyright (C), 2015-2019
 * FileName: Dog
 * Author:   r
 * Date:     2019-09-04 18:49
 */
package com.example.design_pattern.create.prototype;

/**
 * 〈狗〉
 * @author r
 * @date 2019-09-04
 * @version 1.0.0
 */
public class Dog extends Animal {

    public Dog() {
        animalName = "田园犬";
        animalType = "犬类动物";
    }

    @Override
    public void say() {
        System.out.println("I'm a small dog");
    }
}
