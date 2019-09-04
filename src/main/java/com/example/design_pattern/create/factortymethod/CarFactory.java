/**
  * Copyright (C), 2015-2019 
  * FileName: CarFactory 
  * Author:   r  
  * Date:     2019-09-03 14:30 
  */
package com.example.design_pattern.create.factortymethod;
/**
 * 〈汽车工厂类〉
 * @author  r
 * @date    2019-09-03
 * @version 1.0.0
 */
public class CarFactory extends AbstractFactory{
    @Override
    public AbstractProduct create() {
        return new CarProduct();
    }
}
