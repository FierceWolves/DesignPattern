/**
 * Copyright (C), 2015-2019
 * FileName: Cat
 * Author:   r
 * Date:     2019-09-04 18:44
 */
package com.example.design_pattern.create.prototype;

/**
 * 〈猫〉
 * @author r
 * @date 2019-09-04
 * @version 1.0.0
 */
public class Cat extends Animal {

    public Cat() {
        animalType = "猫科动物";
        animalName = "小猫咪";
    }

    @Override
    public void say() {
        System.out.println("I'm a little cat");
    }
}
