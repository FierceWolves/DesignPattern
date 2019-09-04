/**
  * Copyright (C), 2015-2019 
  * FileName: ColdDrink 
  * Author:   r  
  * Date:     2019-09-04 16:46 
  */
package com.example.design_pattern.create.builder;
/**
 * 〈冷饮〉
 * @author  r
 * @date    2019-09-04
 * @version 1.0.0
 */
public abstract class ColdDrink implements Food{

    @Override
    public Packing pack() {
        return new Bottle();
    }
}
