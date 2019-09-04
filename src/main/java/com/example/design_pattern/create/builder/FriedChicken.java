/**
  * Copyright (C), 2015-2019 
  * FileName: FriedChicken 
  * Author:   r  
  * Date:     2019-09-04 16:50 
  */
package com.example.design_pattern.create.builder;
/**
 * 〈快餐炸鸡〉
 * @author  r
 * @date    2019-09-04
 * @version 1.0.0
 */
public class FriedChicken extends FastFood{
    @Override
    public String name() {
        return "炸鸡";
    }

    @Override
    public float price() {
        return 38.8f;
    }
}
