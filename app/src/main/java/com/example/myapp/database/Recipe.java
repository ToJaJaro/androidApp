package com.example.myapp.database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.util.List;

@Entity
public class Recipe {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String title;
    public String instructions;

    // Konstruktor
    public Recipe(String title, String instructions) {
        this.title = title;
        this.instructions = instructions;
    }
}
