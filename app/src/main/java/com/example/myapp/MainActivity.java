package com.example.myapp;



import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Znajdujemy przycisk z layoutu
        Button addRecipeButton = findViewById(R.id.addRecipeButton);
        Button savedRecipieButton = findViewById(R.id.savedRecipiesButton);

        // Ustawiamy nasłuchiwacz kliknięcia dla przycisku
        addRecipeButton.setOnClickListener(v -> {
            // Uruchamiamy RecipeActivity po kliknięciu przycisku
            Intent intent = new Intent(MainActivity.this, RecipeActivity.class);
            startActivity(intent);
        });
        savedRecipieButton.setOnClickListener(v -> {
            // Uruchamiamy RecipeActivity po kliknięciu przycisku
            Intent intent = new Intent(MainActivity.this, SavedRecipesActivity.class);
            startActivity(intent);
        });
    }
}
