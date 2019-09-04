/**
 * Copyright (C), 2015-2019
 * FileName: BuilderPattern
 * Author:   r
 * Date:     2019-09-04 17:15
 */
package com.example.design_pattern.create.builder;

/**
 * 〈构建者模式〉
 * @author r
 * @date 2019-09-04
 * @version 1.0.0
 */
public class BuilderPattern {

    public static void main(String[] args) {
        //通过不同食材组合不同套餐
        RestaurantBuilder builder = new RestaurantBuilder();
        builder.doBreakfast().detail();
        builder.doFastMeal().detail();
        builder.doDinner().detail();
    }
}
