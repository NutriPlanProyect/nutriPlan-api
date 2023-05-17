package com.example.nutriplanapi.model;
import javax.persistence.*;
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
