/**
  * Copyright (C), 2015-2019 
  * FileName: PrototypePattern 
  * Author:   r  
  * Date:     2019-09-04 19:04 
  */
package com.example.design_pattern.create.prototype;
/**
 * 〈原型模式〉
 * @author  r
 * @date    2019-09-04
 * @version 1.0.0
 */
public class PrototypePattern {
    public static void main(String[] args) {
        AnimalCache animalCache = new AnimalCache();
        animalCache.animalCache();
        animalCache.getAnimal("田园犬").say();
        animalCache.getAnimal("小猫咪").say();
    }
}
