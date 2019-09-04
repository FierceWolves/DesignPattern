/**
  * Copyright (C), 2015-2019 
  * FileName: HuaweiProductImpl 
  * Author:   r  
  * Date:     2019-09-03 16:23 
  */
package com.example.design_pattern.create.abstractfactorymethod;
/**
 * 〈华为电脑实现类〉
 * @author  r
 * @date    2019-09-03
 * @version 1.0.0
 */
public class HuaweiProductImpl implements IComputer{
    @Override
    public void use() {
        System.out.println("你正在使用的是huawei");
    }
}
