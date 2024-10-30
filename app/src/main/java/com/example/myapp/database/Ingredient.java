package com.example.myapp.database;


import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.util.List;

@Entity
public class Ingredient {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public int recipeId; // Obcy klucz wskazujący na przepis
    public String name;
    public String amount;
    public String unit;

    // Konstruktor
    public Ingredient(int recipeId, String name, String amount, String unit) {
        this.recipeId = recipeId;
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }
}

