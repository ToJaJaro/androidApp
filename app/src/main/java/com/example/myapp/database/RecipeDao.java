package com.example.myapp.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface RecipeDao {
    @Insert
    long insertRecipe(Recipe recipe);

    @Insert
    void insertIngredients(List<Ingredient> ingredients);

    @Query("SELECT * FROM Recipe")
    List<Recipe> getAllRecipes();

    @Query("SELECT * FROM Ingredient WHERE recipeId = :recipeId")
    List<Ingredient> getIngredientsForRecipe(int recipeId);
}

