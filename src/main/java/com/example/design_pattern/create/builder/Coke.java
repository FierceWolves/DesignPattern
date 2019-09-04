/**
  * Copyright (C), 2015-2019 
  * FileName: Coke 
  * Author:   r  
  * Date:     2019-09-04 16:54 
  */
package com.example.design_pattern.create.builder;
/**
 * 〈可口可乐〉
 * @author  r
 * @date    2019-09-04
 * @version 1.0.0
 */
public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public float price() {
        return 3f;
    }
}
