package com.example.morga.shoping;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class Accueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_00accueil);


//        final Button mescoursesButton= (Button)findViewById(R.id.Mes_courses);
//        mescoursesButton.setOnClickListener(new View.OnClickListener(){
    }

    public void ClickCourse(View courseButton) {
        Intent intent = new Intent(Accueil.this, mes_courses.class);
        startActivity(intent);
    }

    public void ClickSelection(View selectionButton) {
        Intent intent = new Intent(Accueil.this, selection_recette.class);
        startActivity(intent);
    }
    public void ClickRecette(View recetteButton) {
        Intent intent = new Intent(Accueil.this, categorie_recette.class);
        startActivity(intent);
    }
}





