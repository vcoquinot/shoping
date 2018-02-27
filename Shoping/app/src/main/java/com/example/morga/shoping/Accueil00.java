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

            //            recettes de départ

            Recette r1 = new Recette("Velouté de champignons", Category.ENTREE, 4, "Etape 1 | Faire fondre dans une casserole 3 cuillères à soupe de beurre.\n Etape 2 | Ajouter un petit oignon haché et les champignons de Pariscoupés en tout petits morceaux.\n Etape 3 | Saler, poivrer, saupoudrer d’une cuillère à soupe de persilhaché.\n Etape 4 | Remuer bien les champignons dans le beurre chaud. Couvrir et laisser cuire à feu doux 1/4 heure.\n Etape 5 | Ajouter alors 2 cuillères à soupe de farine en remuant sans cesse. Ajouter 1/4 litre de bouillon (ou d’eau) et 1/2 litre de lait.\n Etape 6 | Faire cuire à feu doux en remuant de temps en temps.\n Etape 7 | Lorsque le potage commence à bouillir, baisser le feu et laisser cuire à découvert encore 1/4 d’heure.\n Etape 8 | Quelques minutes avant de servir ajouter le jus d’un citron puis 2 cuillères à soupe de crème fraîche.");

            Ingredients_class ingInRecette1 = new Ingredients_class("Oignon", "légumes");
            IngredientsDeRecette quantiteIngredient = new IngredientsDeRecette(12, ingInRecette1);
            r1.addIngredient(quantiteIngredient);


            realm.copyToRealm(r1);

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





