/**
  * Copyright (C), 2015-2019 
  * FileName: ComputerFactory 
  * Author:   r  
  * Date:     2019-09-03 16:16 
  */
package com.example.design_pattern.create.abstractfactorymethod;
/**
 * 〈电脑工厂类〉
 * @author  r
 * @date    2019-09-03
 * @version 1.0.0
 */
public class ComputerFactory extends AbstractFactory{
    @Override
    public IPhone getPhone(PhoneEnum phoneType) {
        return null;
    }

    @Override
    public IComputer getComputer(ComputerEnum computerType) {
        switch (computerType){
            case HUAWEI:
                return new HuaweiProductImpl();
            case MACBOOK:
                return new MacbookProductImpl();
        }
        return null;
    }
}
