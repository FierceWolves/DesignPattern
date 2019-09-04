/**
 * Copyright (C), 2015-2019
 * FileName: ProducerFactory
 * Author:   r
 * Date:     2019-09-03 16:13
 */
package com.example.design_pattern.create.abstractfactorymethod;


/**
 * 〈生产者工厂〉
 * @author r
 * @date 2019-09-03
 * @version 1.0.0
 */
public class ProducerFactory {
    public AbstractFactory getFactory(FactoryEnum factoryName) {
        switch (factoryName) {
            case PHONE:
                return new PhoneFactory();
            case COMPUTER:
                return new ComputerFactory();
        }
        return null;
    }
}
