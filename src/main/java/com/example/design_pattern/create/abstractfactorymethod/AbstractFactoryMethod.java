/**
  * Copyright (C), 2015-2019 
  * FileName: AbstractFactoryMethod 
  * Author:   r  
  * Date:     2019-09-03 16:27 
  */
package com.example.design_pattern.create.abstractfactorymethod;
/**
 * 〈抽象工厂方法〉
 * @author  r
 * @date    2019-09-03
 * @version 1.0.0
 */
public class AbstractFactoryMethod {
    public static void main(String[] args) {
        ProducerFactory producerFactory = new ProducerFactory();
        AbstractFactory phoneFactory = producerFactory.getFactory(FactoryEnum.PHONE);
        phoneFactory.getPhone(PhoneEnum.IPHONE).call();

        producerFactory.getFactory(FactoryEnum.COMPUTER).getComputer(ComputerEnum.MACBOOK).use();
    }
}
