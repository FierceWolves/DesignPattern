/**
  * Copyright (C), 2015-2019 
  * FileName: Sandwich 
  * Author:   r  
  * Date:     2019-09-04 16:59 
  */
package com.example.design_pattern.create.builder;
/**
 * 〈三明治〉
 * @author  r
 * @date    2019-09-04
 * @version 1.0.0
 */
public class Sandwich extends FastFood{
    @Override
    public String name() {
        return "三明治";
    }

    @Override
    public float price() {
        return 25f;
    }
}
