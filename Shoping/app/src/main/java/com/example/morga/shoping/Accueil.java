package com.example.morga.shoping;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

import io.realm.Realm;
import io.realm.RealmModel;
import io.realm.RealmQuery;
import io.realm.RealmResults;

public class Accueil extends AppCompatActivity {

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
            realm.copyToRealm(new Ingredients_class("carotte","légume"));
            realm.copyToRealm(new Ingredients_class("brocoli","légume"));
            realm.copyToRealm(new Ingredients_class("courgette","légume"));
            realm.copyToRealm(new Ingredients_class("tomate","fruit"));
            realm.copyToRealm(new Ingredients_class("banane","fruit"));
            realm.commitTransaction();
        }


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





