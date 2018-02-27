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
        Intent activity_entree = new Intent(categorie_recette20.this, Liste_recettes21.class);
        activity_entree.putExtra("cat_recettes", Category.ENTREE);
        activity_entree.putExtra(Intent.EXTRA_TEXT, ContentText);
        startActivity(activity_entree);
    }

    public void clickPlat(View platImageButton) {
        Intent activity_plat = new Intent(categorie_recette20.this, Liste_recettes21.class);
        activity_plat.putExtra("cat_recettes", Category.PLAT);
        activity_plat.putExtra(Intent.EXTRA_TEXT, ContentText);
        startActivity(activity_plat);
    }

    public void clickDessert(View dessertImageButton) {
        Intent activity_dessert = new Intent(categorie_recette20.this, Liste_recettes21.class);
        activity_dessert.putExtra("cat_recettes", Category.DESSERT);
        activity_dessert.putExtra(Intent.EXTRA_TEXT, ContentText);
        startActivity(activity_dessert);
    }

    public void clickAutre(View autreImageButton) {
        Intent activity_autre = new Intent(categorie_recette20.this, Liste_recettes21.class);
        activity_autre.putExtra("cat_recettes", Category.AUTRES);
        activity_autre.putExtra(Intent.EXTRA_TEXT, ContentText);
        startActivity(activity_autre);
    }
}
