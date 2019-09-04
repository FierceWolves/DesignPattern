/**
  * Copyright (C), 2015-2019 
  * FileName: AbstractFactory 
  * Author:   r  
  * Date:     2019-09-03 16:10 
  */
package com.example.design_pattern.create.abstractfactorymethod;
/**
 * 〈抽象工厂类〉
 * @author  r
 * @date    2019-09-03
 * @version 1.0.0
 */
public abstract class AbstractFactory {
    public abstract IPhone getPhone(PhoneEnum phoneType);
    public abstract IComputer getComputer(ComputerEnum computerType);
}
