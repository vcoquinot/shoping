package com.example.morga.shoping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public class Categorie_recette extends AppCompatActivity {

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

    public void ClickEntree(View EntreeButton) {
        Intent intent = new Intent(Categorie_recette.this, Ma_recette.class);
        startActivity(intent);
    }

    public void ClickPlat(View PlatButton) {
        Intent intent = new Intent(Categorie_recette.this, Ma_recette.class);
        startActivity(intent);
    }

    public void ClickDessert(View DessertButton) {
        Intent intent = new Intent(Categorie_recette.this, Ma_recette.class);
        startActivity(intent);
    }

    public void ClickAutre(View AutreButton) {
        Intent intent = new Intent(Categorie_recette.this, Ma_recette.class);
        startActivity(intent);
    }
}
