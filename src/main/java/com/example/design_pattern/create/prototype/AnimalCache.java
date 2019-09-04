/**
 * Copyright (C), 2015-2019
 * FileName: AnimalCache
 * Author:   r
 * Date:     2019-09-04 18:52
 */
package com.example.design_pattern.create.prototype;

import java.awt.*;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * 〈动物原型克隆〉
 *
 * @author r
 * @version 1.0.0
 * @date 2019-09-04
 */
public class AnimalCache {

    private static Hashtable<String, Animal> map = new Hashtable();

    public Animal getAnimal(String animalName) {
        Animal animal = map.get(animalName);
        return (Animal) animal.clone();
    }

    public void animalCache() {
        Cat cat = new Cat();
        map.put(cat.animalName, cat);
        Dog dog = new Dog();
        map.put(dog.animalName, dog);
    }

}
