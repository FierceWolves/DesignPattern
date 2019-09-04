/**
  * Copyright (C), 2015-2019 
  * FileName: CarProduct 
  * Author:   r  
  * Date:     2019-09-03 14:34 
  */
package com.example.design_pattern.create.factortymethod;
/**
 * 〈汽车产品类〉
 * @author  r
 * @date    2019-09-03
 * @version 1.0.0
 */
public class CarProduct extends AbstractProduct{
    @Override
    public void use() {
        System.out.println("奥迪A6生产完成");
    }
}
