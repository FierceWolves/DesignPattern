/**
 * Copyright (C), 2015-2019
 * FileName: AbstractFactory
 * Author:   r
 * Date:     2019-09-03 14:23
 */
package com.example.design_pattern.create.factortymethod;

/**
 * 〈抽象工厂类〉
 * @author r
 * @date 2019-09-03
 * @version 1.0.0
 */
public abstract class AbstractFactory {
    //生成
    public abstract AbstractProduct create();
}
