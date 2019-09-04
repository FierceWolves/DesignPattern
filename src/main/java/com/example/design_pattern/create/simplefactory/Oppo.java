/**
  * Copyright (C), 2015-2019 
  * FileName: Oppo 
  * Author:   r  
  * Date:     2019-09-03 16:50 
  */
package com.example.design_pattern.create.simplefactory;
/**
 * 〈Oppo手机〉
 * @author  r
 * @date    2019-09-03
 * @version 1.0.0
 */
public class Oppo extends AbstractPhone{
    @Override
    public void call() {
        System.out.println("Oppo 正在为你接通");
    }
}
