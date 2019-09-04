/**
  * Copyright (C), 2015-2019 
  * FileName: Milk 
  * Author:   r  
  * Date:     2019-09-04 16:56 
  */
package com.example.design_pattern.create.builder;
/**
 * 〈牛奶〉
 * @author  r
 * @date    2019-09-04
 * @version 1.0.0
 */
public class Milk extends ColdDrink{
    @Override
    public String name() {
        return "牛奶";
    }

    @Override
    public float price() {
        return 5f;
    }
}
