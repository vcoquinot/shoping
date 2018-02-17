package com.example.morga.shoping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;

public class categorie_recette extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_20categorie_recette);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void clickEntree(View entreeImageButton) {
        Intent intent = new Intent(categorie_recette.this, Liste_recettes.class);
        startActivity(intent);
    }

    public void clickPlat(View platImageButton) {
        Intent intent = new Intent(categorie_recette.this, Liste_recettes.class);
        startActivity(intent);
    }

    public void clickDessert(View dessertImageButton) {
        Intent intent = new Intent(categorie_recette.this, Liste_recettes.class);
        startActivity(intent);
    }

    public void clickAutre(View autreImageButton) {
        Intent intent = new Intent(categorie_recette.this, Liste_recettes.class);
        startActivity(intent);
    }
}
