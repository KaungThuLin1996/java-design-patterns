package com.learn.patterns.design.creational.builder.impl4;

public class Client {

	public static void main(String[] args) {
		Director director = new Director();
		MealBuilderInterface vegMealBuilder = new VegMealBuilder();
		MealBuilderInterface nonVegMealBuilder = new NonVegMealBuilder();
		
		director.construct(vegMealBuilder);
		Meal vegMeal = vegMealBuilder.getMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		
		System.out.println();
		
		director.construct(nonVegMealBuilder);
		Meal nonVegMeal = vegMealBuilder.getMeal();
		System.out.println("Non Veg Meal");
		nonVegMeal.showItems();
	}
}
