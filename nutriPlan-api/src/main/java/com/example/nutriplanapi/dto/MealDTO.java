package com.example.nutriplanapi.dto;

import lombok.Data;

import java.util.List;
@Data
public class MealDTO {
    private String name;

    private List<FoodDTO> foods;

}
