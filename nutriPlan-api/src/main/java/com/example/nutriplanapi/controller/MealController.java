package com.example.nutriplanapi.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
public class MealController {
    private final MealService mealService;

    public MealController(MealService mealService) {
        this.mealService = mealService;
    }

    @PostMapping
    public ResponseEntity<MealDTO> createMeal(@RequestBody MealDTO mealDTO) {
        MealDTO createdMeal = mealService.createMeal(mealDTO);
        return ResponseEntity.ok(createMeal);
    }
}
