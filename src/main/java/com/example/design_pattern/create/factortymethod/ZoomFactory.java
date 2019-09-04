/**
  * Copyright (C), 2015-2019 
  * FileName: ZoomFactory 
  * Author:   r  
  * Date:     2019-09-03 14:50 
  */
package com.example.design_pattern.create.factortymethod;
/**
 * 〈房间工厂〉
 * @author  r
 * @date    2019-09-03
 * @version 1.0.0
 */
public class ZoomFactory extends AbstractFactory{
    @Override
    public AbstractProduct create() {
        return new ZoomProduct();
    }
}
