package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RecipeActivity extends AppCompatActivity {
    private EditText titleEditText, ingredientsEditText, instructionsEditText;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        titleEditText = findViewById(R.id.recipeTitle);
        ingredientsEditText = findViewById(R.id.recipeIngredients);
        instructionsEditText = findViewById(R.id.recipeInstructions);
        saveButton = findViewById(R.id.saveRecipeButton);

        saveButton.setOnClickListener(v -> {
            String title = titleEditText.getText().toString();
            String ingredients = ingredientsEditText.getText().toString();
            String instructions = instructionsEditText.getText().toString();

            // Możesz tutaj zapisać przepis np. do bazy danych lub wyświetlić
            Toast.makeText(RecipeActivity.this, "Przepis zapisany", Toast.LENGTH_SHORT).show();
        });
    }
}
