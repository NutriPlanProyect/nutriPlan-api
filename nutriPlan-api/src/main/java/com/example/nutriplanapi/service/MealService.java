package com.example.nutriplanapi.service;
import com.example.nutriplanapi.dto.MealDTO;
import com.example.nutriplanapi.model.Meal;
import com.example.nutriplanapi.exception.InvalidMealRequestException;
import com.example.nutriplanapi.exception.MealNotFoundException;
import com.example.nutriplanapi.model.Meal;

public interface MealService {
    Meal createMeal(Meal meal) throws InvalidMealRequestException;
    Meal getMealById(String mealId) throws MealNotFoundException;
}
