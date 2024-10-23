package com.example.myapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class SavedRecipesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecipeAdapter recipeAdapter;
    private List<String> recipeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_recipes);

        recyclerView = findViewById(R.id.recipesRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Przykładowe przepisy (tutaj możesz załadować przepisy np. z bazy danych)
        recipeList = new ArrayList<>();
        recipeList.add("Spaghetti Bolognese");
        recipeList.add("Pizza Margherita");
        recipeList.add("Tiramisu");

        // Tworzymy adapter z listą przepisów
        recipeAdapter = new RecipeAdapter(recipeList);
        recyclerView.setAdapter(recipeAdapter);
    }
}
