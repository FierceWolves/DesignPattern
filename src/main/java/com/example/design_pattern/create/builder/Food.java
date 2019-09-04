/**
  * Copyright (C), 2015-2019 
  * FileName: Food
  * Author:   r  
  * Date:     2019-09-04 16:43 
  */
package com.example.design_pattern.create.builder;
/**
 * 〈食材父类〉
 * @author  r
 * @date    2019-09-04
 * @version 1.0.0
 */
public interface Food {

    String name();

    Packing pack();

    float price();
}
