/**
 * Copyright (C), 2015-2019
 * FileName: Meal
 * Author:   r
 * Date:     2019-09-04 16:40
 */
package com.example.design_pattern.create.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈套餐组成〉
 *
 * @author r
 * @version 1.0.0
 * @date 2019-09-04
 */
public class Meal {

    private List<Food> foodList = new ArrayList<>();

    private String mealName;

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public void addFood(Food food) {
        foodList.add(food);
    }

    public void detail() {
        System.out.println("meal:" + mealName);
        for (Food food : foodList) {
            System.out.println("food:" + food.name() + " packing:" + food.pack().packType() + " price:" + food.price());
        }
    }

    public float total() {
        float cost = 0f;
        for (Food food : foodList) {
            cost = cost + food.price();
        }
        return cost;
    }
}
