/**
  * Copyright (C), 2015-2019 
  * FileName: ZoomProduct
  * Author:   r  
  * Date:     2019-09-03 14:51 
  */
package com.example.design_pattern.create.factortymethod;
/**
 * 〈Zoom产品〉
 * @author  r
 * @date    2019-09-03
 * @version 1.0.0
 */
public class ZoomProduct extends AbstractProduct{
    @Override
    public void use() {
        System.out.println("zoom 生产完成");
    }
}
