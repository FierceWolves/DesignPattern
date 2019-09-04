/**
  * Copyright (C), 2015-2019 
  * FileName: OppoPhoneImpl
  * Author:   r  
  * Date:     2019-09-03 16:06 
  */
package com.example.design_pattern.create.abstractfactorymethod;
/**
 * 〈oppo手机实现类〉
 * @author  r
 * @date    2019-09-03
 * @version 1.0.0
 */
public class OppoPhoneImpl implements IPhone{
    @Override
    public void call() {
        System.out.println("oppo 手机为你拨通电话");
    }
}
