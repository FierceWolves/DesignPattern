/**
  * Copyright (C), 2015-2019 
  * FileName: Animal 
  * Author:   r  
  * Date:     2019-09-04 18:40 
  */
package com.example.design_pattern.create.prototype;
/**
 * 〈动物父类〉
 * @author  r
 * @date    2019-09-04
 * @version 1.0.0
 */
public abstract class Animal implements Cloneable{

    protected String animalName;

    protected String animalType;

    public abstract void say();

    public Object clone(){
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

}
