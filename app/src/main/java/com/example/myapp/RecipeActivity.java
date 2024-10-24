package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RecipeActivity extends AppCompatActivity {

    private EditText titleEditText, instructionsEditText;
    private Button saveButton, addButton;
    private ArrayList<LinearLayout> ingredientLayouts = new ArrayList<>();
    private LinearLayout ingredientsContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        titleEditText = findViewById(R.id.recipeTitle);
        instructionsEditText = findViewById(R.id.recipeInstructions);
        ingredientsContainer = findViewById(R.id.ingredientsContainer);

        addButton = findViewById(R.id.addButton);
        saveButton = findViewById(R.id.saveRecipeButton);

        // Obsługa kliknięcia na przycisk dodawania
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addIngredientLayout();
            }
        });
    }

    // Funkcja do dodawania nowego układu składników
    private void addIngredientLayout() {
        // Tworzenie nowego layoutu dla składników
        LinearLayout newIngredientLayout = new LinearLayout(this);
        newIngredientLayout.setOrientation(LinearLayout.HORIZONTAL);

        // Tworzenie EditText dla składnika
        EditText ingredientEditText = new EditText(this);
        ingredientEditText.setLayoutParams(new LinearLayout.LayoutParams(202, LinearLayout.LayoutParams.WRAP_CONTENT));
        ingredientEditText.setHint("Składniki");

        // Tworzenie EditText dla ilości
        EditText amountEditText = new EditText(this);
        amountEditText.setLayoutParams(new LinearLayout.LayoutParams(70, LinearLayout.LayoutParams.WRAP_CONTENT));
        amountEditText.setHint("ilość");

        // Tworzenie EditText dla jednostki
        EditText unitEditText = new EditText(this);
        unitEditText.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
        unitEditText.setHint("jednkostka");

        // Tworzenie przycisku usuwania
        Button deleteButton = new Button(this);
        deleteButton.setText("x");
        deleteButton.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        // Listener usuwania składnika
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ingredientsContainer.removeView(newIngredientLayout);
                ingredientLayouts.remove(newIngredientLayout);
            }
        });

        // Dodanie wszystkich elementów do layoutu składnika
        newIngredientLayout.addView(ingredientEditText);
        newIngredientLayout.addView(amountEditText);
        newIngredientLayout.addView(unitEditText);
        newIngredientLayout.addView(deleteButton);

        // Dodanie nowego layoutu do kontenera
        ingredientsContainer.addView(newIngredientLayout);
        ingredientLayouts.add(newIngredientLayout); // Dodajemy layout do listy dla późniejszego dostępu
    }
}
