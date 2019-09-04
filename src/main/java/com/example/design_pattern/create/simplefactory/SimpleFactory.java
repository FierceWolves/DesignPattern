/**
  * Copyright (C), 2015-2019 
  * FileName: SimpleFactory 
  * Author:   r  
  * Date:     2019-09-03 16:52 
  */
package com.example.design_pattern.create.simplefactory;
/**
 * 〈简单工厂〉
 * @author  r
 * @date    2019-09-03
 * @version 1.0.0
 */
public class SimpleFactory {
    public static void main(String[] args) {
        new PhoneFactory().crate("oppo").call();
    }
}
