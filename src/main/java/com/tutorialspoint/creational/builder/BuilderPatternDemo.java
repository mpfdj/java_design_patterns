// https://www.tutorialspoint.com/design_pattern/builder_pattern.htm

package com.tutorialspoint.creational.builder;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost: " + vegMeal.getCost());

        System.out.println();

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total cost: " + nonVegMeal.getCost());
    }
}
