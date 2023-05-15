package com.example.nutriplanapi.exception;

public class MealNotFoundException extends Throwable {
    public MealNotFoundException(String mealPlanNotFound) {
    }

    public MealNotFoundException(Long mealPlanId) {
    }
}
