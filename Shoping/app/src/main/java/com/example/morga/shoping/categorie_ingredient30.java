package com.example.morga.shoping;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class categorie_ingredient30 extends AbstractActivity {

    public String ContentText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_30categorie_ingredient);
    }



    public void clickFruit(View fruitImageButton) {
        Intent intent = new Intent(categorie_ingredient30.this, liste_ingredients31.class);
        intent.putExtra("cat_ingredients", Category.FRUITS);
        intent.putExtra(Intent.EXTRA_TEXT, ContentText);
        startActivity(intent);
    }

    public void clickLegume(View legumeImageButton) {
        Intent intent = new Intent(categorie_ingredient30.this, liste_ingredients31.class);
        intent.putExtra("cat_ingredients", Category.LEGUMES);
        intent.putExtra(Intent.EXTRA_TEXT, ContentText);
        startActivity(intent);
    }

    public void clickBoucherie(View boucherieImageButton) {
        Intent intent = new Intent(categorie_ingredient30.this, liste_ingredients31.class);
        intent.putExtra("cat_ingredients", "boucherie");
        intent.putExtra(Intent.EXTRA_TEXT, ContentText);
        startActivity(intent);
    }

    public void clickPoissonnerie(View poissonnerieImageButton) {
        Intent intent = new Intent(categorie_ingredient30.this, liste_ingredients31.class);
        intent.putExtra("cat_ingredients", "poissonnerie");
        intent.putExtra(Intent.EXTRA_TEXT, ContentText);
        startActivity(intent);
    }

    public void clickFrais(View fraisImageButton) {
        Intent intent = new Intent(categorie_ingredient30.this, liste_ingredients31.class);
        intent.putExtra("cat_ingredients", "frais");
        intent.putExtra(Intent.EXTRA_TEXT, ContentText);
        startActivity(intent);
    }

    public void clickEpicerie(View epicerieImageButton) {
        Intent intent = new Intent(categorie_ingredient30.this, liste_ingredients31.class);
        intent.putExtra("cat_ingredients", "épicerie");
        intent.putExtra(Intent.EXTRA_TEXT, ContentText);
        startActivity(intent);
    }

    public void clickBoisson(View boissonImageButton) {
        Intent intent = new Intent(categorie_ingredient30.this, liste_ingredients31.class);
        intent.putExtra("cat_ingredients", "boissons");
        intent.putExtra(Intent.EXTRA_TEXT, ContentText);
        startActivity(intent);
    }
}
