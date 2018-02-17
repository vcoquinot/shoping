package com.example.morga.shoping;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

public class Accueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_00accueil);


    }

    public void ClickCourse(View courseButton) {
        //Intent intent = new Intent(Accueil.this, mes_courses.class);
        //!!!!!!!!CHANGED DIRECTION TO CHECK ACTIVITY!!!!!!!!
        //Intent intent = new Intent(Accueil.this, categorie_ingredient.class);
        Intent intent = new Intent(Accueil.this, Ma_recette.class);
        startActivity(intent);
    }

    public void ClickSelection(View selectionButton) {
        Intent intent = new Intent(Accueil.this, selection_recette.class);
        startActivity(intent);
    }
    public void ClickRecette(View recetteButton) {
        Intent intent = new Intent(Accueil.this, mes_courses.class);
        startActivity(intent);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.aide_menu){
            Intent aide=new Intent(this,Aide.class);
            startActivity(aide);

        }
        return super.onOptionsItemSelected(item);
    }
}





