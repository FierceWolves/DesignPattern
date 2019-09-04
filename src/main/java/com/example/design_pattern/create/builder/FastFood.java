/**
  * Copyright (C), 2015-2019 
  * FileName: FastFood 
  * Author:   r  
  * Date:     2019-09-04 16:45 
  */
package com.example.design_pattern.create.builder;
/**
 * 〈快餐食品〉
 * @author  r
 * @date    2019-09-04
 * @version 1.0.0
 */
public abstract class FastFood implements Food{

    @Override
    public Packing pack() {
        return new Wapper();
    }
}
