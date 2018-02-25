package com.example.morga.shoping;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class categorie_recette20 extends AbstractActivity {

    public String ContentText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_20categorie_recette);
    }



    public void clickEntree(View entreeImageButton) {
        Intent activity_entree = new Intent(this, Liste_recettes21.class);
        activity_entree.putExtra("cat_recettes", "ENTRÉE");
        activity_entree.putExtra(Intent.EXTRA_TEXT, ContentText);

        startActivity(activity_entree);

    }

    public void clickPlat(View platImageButton) {
//        Intent intent = new Intent(categorie_recette20.this, Liste_recettes21.class);
//        startActivity(intent);
    }

    public void clickDessert(View dessertImageButton) {
//        Intent intent = new Intent(categorie_recette20.this, Liste_recettes21.class);
//        startActivity(intent);
    }

    public void clickAutre(View autreImageButton) {
//        Intent intent = new Intent(categorie_recette20.this, Liste_recettes21.class);
//        startActivity(intent);
    }
}
