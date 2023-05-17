package com.example.nutriplanapi.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
public class MealServiceImpl implements MealService{
    private final MealRepository mealRepository;
    private final MealDTOMapper mealMapper;

    public MealServiceImpl(MealRepository mealRepository, MealDTOMapper mealMapper) {
        this.mealRepository = mealRepository;
        this.mealMapper = mealMapper;
    }

    @Override
    public MealDTO createMeal(MealDTO mealDTO) {
        Meal meal = mealMapper.toEntity(mealDTO);
        Meal savedMeal = mealRepository.save(meal);
        return mealMapper.toDTO(savedMeal);
    }
}

