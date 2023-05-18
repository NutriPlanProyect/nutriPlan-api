package com.example.nutriplanapi.controller;
import com.example.nutriplanapi.dto.MealDTO;
import com.example.nutriplanapi.exception.InvalidMealRequestException;
import com.example.nutriplanapi.exception.MealNotFoundException;
import com.example.nutriplanapi.mapper.MealDTOMapper;
import com.example.nutriplanapi.model.Meal;
import com.example.nutriplanapi.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import com.example.nutriplanapi.service.MealService

@RequestMapping("/meals")
public class MealController {
    private final MealService mealService;
    private final MealDTOMapper mealDTOMapper;

    public MealController(MealService mealService, MealDTOMapper mealDTOMapper) {
        this.mealService = mealService;
        this.mealDTOMapper = mealDTOMapper;
    }

    @PostMapping
    public ResponseEntity<MealDTO> createMeal(@RequestBody MealDTO mealDTO) {
        try {
            Meal meal = mealDTOMapper.toEntity(mealDTO);
            Meal createdMeal = mealService.createMeal(meal);
            MealDTO createdMealDTO = mealDTOMapper.toDTO(createdMeal);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdMealDTO);
        } catch (InvalidMealRequestException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


    @GetMapping("/{mealId}")
    public ResponseEntity<MealDTO> getMealById(@PathVariable String mealId) {
        try {
            Meal meal = mealService.getMealById(mealId);
            MealDTO mealDTO = mealDTOMapper.toDTO(meal);
            return ResponseEntity.ok(mealDTO);
        } catch (MealNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
