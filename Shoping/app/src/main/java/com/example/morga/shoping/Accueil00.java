package com.example.morga.shoping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import io.realm.Realm;
import io.realm.RealmResults;

public class Accueil00 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_00accueil);
        Realm.init(this);
        RealmResults<Ingredients_class> _listIndredient;
        Realm realm = Realm.getDefaultInstance();
        _listIndredient=realm.where(Ingredients_class.class).findAll();
        if (_listIndredient.size()==0){


            realm.beginTransaction();

            //            ingrédients de départ
            realm.copyToRealm(new Ingredients_class("Carotte","légume"));
            realm.copyToRealm(new Ingredients_class("Brocoli","légume"));
            realm.copyToRealm(new Ingredients_class("Courgette","légume"));
            realm.copyToRealm(new Ingredients_class("Champigon","légume"));
            realm.copyToRealm(new Ingredients_class("Oignons","légume"));
            realm.copyToRealm(new Ingredients_class("Tomate","fruit"));
            realm.copyToRealm(new Ingredients_class("Banane","fruit"));
            realm.copyToRealm(new Ingredients_class("Boeuf","boucherie"));
            realm.copyToRealm(new Ingredients_class("Lapin","boucherie"));
            realm.copyToRealm(new Ingredients_class("Lotte","poissonnerie"));
            realm.copyToRealm(new Ingredients_class("Saumon","poissonnerie"));
            realm.copyToRealm(new Ingredients_class("Fromage","frais"));
            realm.copyToRealm(new Ingredients_class("Chocolat","épicerie"));
            realm.copyToRealm(new Ingredients_class("Vin blanc","boissons"));


            realm.commitTransaction();
        }


    }

    public void ClickCourse(View courseButton) {

        Intent intent = new Intent(Accueil00.this, mes_courses40.class);
        startActivity(intent);
    }

    public void ClickSelection(View selectionButton) {
        Intent intent = new Intent(Accueil00.this, selection_recette10.class);
        startActivity(intent);
    }
    public void ClickRecette(View recetteButton) {
        Intent intent = new Intent(Accueil00.this, categorie_recette20.class);
        startActivity(intent);
    }


}





