/**
  * Copyright (C), 2015-2019 
  * FileName: FactoryMethod 
  * Author:   r  
  * Date:     2019-09-03 14:49 
  */
package com.example.design_pattern.create.factortymethod;
/**
 * 〈工厂方法测试〉
 * @author  r
 * @date    2019-09-03
 * @version 1.0.0
 */
public class FactoryMethod {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        carFactory.create().use();

        ZoomFactory zoomFactory = new ZoomFactory();
        zoomFactory.create().use();
    }
}
