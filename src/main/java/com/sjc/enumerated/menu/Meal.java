package com.sjc.enumerated.menu;

/**
 * @author jiecheng
 * @create 2017-12-07 下午11:54
 */
public class Meal {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (Course course : Course.values()) {
                Food food = course.randomSelection();
                System.out.println(food);
            }
            System.out.println("---");
        }
    }
}
