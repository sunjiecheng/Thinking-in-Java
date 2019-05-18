package com.sjc.enumerated.menu;

import static com.sjc.enumerated.menu.Food.*;
/**
 * @author jiecheng
 * @create 2017-12-07 下午11:43
 */
public class TypeOfFood {
    public static void main(String[] args) {
        Food food = Appetizer.SALAD;
        food = MainCourse.LASAGNE;
        food = Dessert.GELATO;
        food = Coffee.CAPPUCCINO;
    }
}
