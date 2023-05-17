package com.example.nutriplanapi.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
public interface MealService {
    MealDTO createMeal(MealDTO mealDTO);
}
