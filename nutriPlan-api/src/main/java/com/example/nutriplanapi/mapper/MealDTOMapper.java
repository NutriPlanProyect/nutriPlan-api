package com.example.nutriplanapi.mapper;
import org.springframework.stereotype.Component;
import com.example.nutriplanapi.dto.MealDTO;
import com.example.nutriplanapi.model.Meal;
public class MealDTOMapper {
    public MealDTO toDTO(Meal meal) {
        MealDTO mealDTO = new MealDTO();
        mealDTO.setName(meal.getName());
        // Mapeo de los alimentos si es necesario
        return mealDTO;
    }

    public Meal toEntity(MealDTO mealDTO) {
        Meal meal = new Meal();
        meal.setName(mealDTO.getName());
        // Mapeo de los alimentos si es necesario
        return meal;
    }
}
