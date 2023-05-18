package com.example.nutriplanapi.service;
import com.example.nutriplanapi.dto.MealDTO;
import com.example.nutriplanapi.exception.InvalidMealRequestException;
import com.example.nutriplanapi.exception.MealNotFoundException;
import com.example.nutriplanapi.mapper.MealDTOMapper;
import com.example.nutriplanapi.model.Meal;
import com.example.nutriplanapi.repository.MealRepository;

public class MealServiceImpl implements MealService{
    private final MealRepository mealRepository;
    private final MealDTOMapper mealMapper;

    public MealServiceImpl(MealRepository mealRepository, MealDTOMapper mealMapper) {
        this.mealRepository = mealRepository;
        this.mealMapper = mealMapper;
    }
    public MealDTO createMeal(MealDTO mealDTO) {
        Meal meal = mealMapper.toEntity(mealDTO);
        Meal savedMeal = mealRepository.save(meal);
        return mealMapper.toDTO(savedMeal);
    }

    @Override
    public Meal createMeal(Meal meal) throws InvalidMealRequestException {
        return null;
    }

    @Override
    public Meal getMealById(String mealId) throws MealNotFoundException {
        return null;
    }
}

