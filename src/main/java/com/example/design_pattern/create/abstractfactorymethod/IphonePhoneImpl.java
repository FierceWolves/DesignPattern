/**
  * Copyright (C), 2015-2019 
  * FileName: IphonePhoneImpl
  * Author:   r  
  * Date:     2019-09-03 16:05 
  */
package com.example.design_pattern.create.abstractfactorymethod;
/**
 * 〈iphone手机实现类〉
 * @author  r
 * @date    2019-09-03
 * @version 1.0.0
 */
public class IphonePhoneImpl implements IPhone{
    @Override
    public void call() {
        System.out.println("iphone 已为你拨通电话");
    }
}
