/**
 * Copyright (C), 2015-2019
 * FileName: RestaurantBuilder
 * Author:   r
 * Date:     2019-09-04 16:37
 */
package com.example.design_pattern.create.builder;

/**
 * 〈餐厅套餐构建〉
 * @author r
 * @date 2019-09-04
 * @version 1.0.0
 */
public class RestaurantBuilder {

    public Meal doFastMeal() {
        Meal meal = new Meal();
        meal.setMealName("快餐");
        meal.addFood(new FriedChicken());
        meal.addFood(new Coke());
        return meal;
    }

    public Meal doBreakfast() {
        Meal meal = new Meal();
        meal.setMealName("早餐");
        meal.addFood(new Sandwich());
        meal.addFood(new Milk());
        return meal;
    }

    public Meal doDinner(){
        Meal meal = new Meal();
        meal.setMealName("晚餐");
        meal.addFood(new FriedChicken());
        meal.addFood(new Sandwich());
        meal.addFood(new Coke());
        return meal;
    }
}
