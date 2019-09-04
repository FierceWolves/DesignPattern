/**
  * Copyright (C), 2015-2019 
  * FileName: PhoneFactory 
  * Author:   r  
  * Date:     2019-09-03 16:48 
  */
package com.example.design_pattern.create.simplefactory;
/**
 * 〈手机工厂类〉
 * @author  r
 * @date    2019-09-03
 * @version 1.0.0
 */
public class PhoneFactory {
    public AbstractPhone crate(String phoneType){
        if ("oppo".equals(phoneType)){
            return new Oppo();
        }
        return null;
    }
}
