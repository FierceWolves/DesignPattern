/**
  * Copyright (C), 2015-2019 
  * FileName: Bottle 
  * Author:   r  
  * Date:     2019-09-04 16:52 
  */
package com.example.design_pattern.create.builder;
/**
 * 〈瓶装〉
 * @author  r
 * @date    2019-09-04
 * @version 1.0.0
 */
public class Bottle implements Packing{
    @Override
    public String packType() {
        return "瓶装";
    }
}
