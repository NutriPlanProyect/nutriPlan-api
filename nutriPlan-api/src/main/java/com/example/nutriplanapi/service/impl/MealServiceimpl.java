package com.example.nutriplanapi.service.impl;
import com.example.nutriplanapi.exception.InvalidMealRequestException;
import com.example.nutriplanapi.exception.MealNotFoundException;
import com.example.nutriplanapi.model.Meal;
import com.example.nutriplanapi.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.nutriplanapi.repository.MealRepository;
@Service

public class MealServiceimpl implements MealService {
    private MealRepository mealRepository;

    @Autowired
    public void MealServiceImpl(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    public MealServiceimpl(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    @Override
    public Meal createMeal(Meal meal) throws InvalidMealRequestException {
        return null;
    }

    @Override
    public Meal getMealById(String mealId) throws MealNotFoundException {
        // Implementación de la lógica para obtener un meal por su ID
        // ...

        return mealRepository.findById(Long.valueOf(mealId))
                .orElseThrow(() -> new MealNotFoundException("Meal not found with ID: " + mealId));
    }
}
