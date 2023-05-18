package com.example.nutriplanapi.repository;
import com.example.nutriplanapi.model.Meal;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository  extends JpaRepository <Meal,Long>{

}
