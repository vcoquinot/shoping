package com.example.morga.shoping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import io.realm.Realm;
import io.realm.RealmList;
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
            realm.copyToRealm(new Ingredients_class("Carotte",Category.LEGUMES));
            realm.copyToRealm(new Ingredients_class("Brocoli",Category.LEGUMES));
            realm.copyToRealm(new Ingredients_class("Courgette",Category.LEGUMES));
            realm.copyToRealm(new Ingredients_class("Champigon",Category.LEGUMES));
            realm.copyToRealm(new Ingredients_class("Oignons",Category.LEGUMES));
            realm.copyToRealm(new Ingredients_class("Tomate",Category.FRUITS));
            realm.copyToRealm(new Ingredients_class("Banane",Category.FRUITS));
            realm.copyToRealm(new Ingredients_class("Boeuf",Category.BOUCHERIE));
            realm.copyToRealm(new Ingredients_class("Lapin",Category.BOUCHERIE));
            realm.copyToRealm(new Ingredients_class("Lotte",Category.POISSONNERIE));
            realm.copyToRealm(new Ingredients_class("Saumon",Category.POISSONNERIE));
            realm.copyToRealm(new Ingredients_class("Fromage",Category.FRAIS));
            realm.copyToRealm(new Ingredients_class("Chocolat",Category.EPICERIE));
            realm.copyToRealm(new Ingredients_class("Vin blanc",Category.BOISSONS));

            //            recettes de départ

            Recette r1 = new Recette("Velouté de champignons", Category.ENTREE, 4, "Etape 1 | Faire fondre dans une casserole 3 cuillères à soupe de beurre.\n Etape 2 | Ajouter un petit oignon haché et les champignons de Pariscoupés en tout petits morceaux.\n Etape 3 | Saler, poivrer, saupoudrer d’une cuillère à soupe de persilhaché.\n Etape 4 | Remuer bien les champignons dans le beurre chaud. Couvrir et laisser cuire à feu doux 1/4 heure.\n Etape 5 | Ajouter alors 2 cuillères à soupe de farine en remuant sans cesse. Ajouter 1/4 litre de bouillon (ou d’eau) et 1/2 litre de lait.\n Etape 6 | Faire cuire à feu doux en remuant de temps en temps.\n Etape 7 | Lorsque le potage commence à bouillir, baisser le feu et laisser cuire à découvert encore 1/4 d’heure.\n Etape 8 | Quelques minutes avant de servir ajouter le jus d’un citron puis 2 cuillères à soupe de crème fraîche.");
            Ingredients_class ingInRecette1 = new Ingredients_class("Oignon", Category.LEGUMES);
            Ingredients_class ing2InRecette1 = new Ingredients_class("Beurre", Category.FRAIS);
            Ingredients_class ing3InRecette1 = new Ingredients_class("Farine", Category.EPICERIE);
            Ingredients_class ing4InRecette1 = new Ingredients_class("Crème fraiche", Category.FRAIS);
            IngredientsDeRecette quantiteIngredient = new IngredientsDeRecette(12, ingInRecette1);
            IngredientsDeRecette quantiteIngredient2 = new IngredientsDeRecette(1, ingInRecette1);
            IngredientsDeRecette quantiteIngredient3 = new IngredientsDeRecette(1, ingInRecette1);
            IngredientsDeRecette quantiteIngredient4 = new IngredientsDeRecette(1, ingInRecette1);
            r1.addIngredient(quantiteIngredient);

            Recette r2 = new Recette("Poulet au Mont-d'or et champignons", Category.PLAT, 4, "Etape 1 |Préchauffer le four à 210°C (thermostat 7).\n Etape 2 | Découper le poulet (voir vidéos très bien faites). \n Etape 3 | Faire revenir les morceaux de poulet dans une poêle pour les colorer. \n Etape 4 | Mettre les morceaux de poulet dans un plat allant au four.)\n Etape 5 | Cuire 20 minutes. Pendant ce temps, faire revenir les champignons dans la même poêle. Couper le feu lorsque les champignons sont décongelés.\n Etape 6 | A la fin de la cuisson du poulet, ajouter les champignons dans le plat. Sortir le Mont-d'Or de sa boite en bois, le couper en deux et le poser sur le plat.");
            Ingredients_class ingInRecette2 = new Ingredients_class("Poulet", Category.BOUCHERIE);
            IngredientsDeRecette quantiteIngredientR2 = new IngredientsDeRecette(1, ingInRecette2);
            r2.addIngredient(quantiteIngredient);

            Recette r3 = new Recette("Tarte au potiron et boeuf haché", Category.PLAT, 6, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
            Ingredients_class ingInRecette3 = new Ingredients_class("Oeuf", Category.BOUCHERIE);
            IngredientsDeRecette quantiteIngredientr3 = new IngredientsDeRecette(3, ingInRecette3);
            r3.addIngredient(quantiteIngredient);

            Recette r4 = new Recette("Tarte poire chocolat", Category.DESSERT, 4, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
            Ingredients_class ingInRecette4 = new Ingredients_class("Poudre d'amande", Category.EPICERIE);
            IngredientsDeRecette quantiteIngredientr4 = new IngredientsDeRecette(1, ingInRecette4);
            r4.addIngredient(quantiteIngredient);

            Recette r5 = new Recette("Rochers à la noix de coco", Category.DESSERT, 6, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
            Ingredients_class ingInRecette5 = new Ingredients_class("Noix de coco râpée", Category.EPICERIE);
            IngredientsDeRecette quantiteIngredientr5 = new IngredientsDeRecette(1, ingInRecette5);
            r5.addIngredient(quantiteIngredient);

            Recette r6 = new Recette("Tapas", Category.AUTRE, 4, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
            Ingredients_class ingInRecette6 = new Ingredients_class("Huile d'olive", Category.EPICERIE);
            IngredientsDeRecette quantiteIngredientr6 = new IngredientsDeRecette(1, ingInRecette6);
            r6.addIngredient(quantiteIngredient);

            Recette r7 = new Recette("Boisson de Noël", Category.AUTRE, 4, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
            Ingredients_class ingInRecette7 = new Ingredients_class("Sucre", Category.EPICERIE);
            IngredientsDeRecette quantiteIngredientr7 = new IngredientsDeRecette(1, ingInRecette7);
            r7.addIngredient(quantiteIngredient);

            Recette r8 = new Recette("Oeuf cocotte au fromage", Category.ENTREE, 2, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
            Ingredients_class ingInRecette8 = new Ingredients_class("Jambon de pays", Category.BOUCHERIE);
            IngredientsDeRecette quantiteIngredientr8 = new IngredientsDeRecette(4, ingInRecette8);
            r8.addIngredient(quantiteIngredient);


            realm.copyToRealm(r1);
            realm.copyToRealm(r2);
            realm.copyToRealm(r3);
            realm.copyToRealm(r4);
            realm.copyToRealm(r5);
            realm.copyToRealm(r6);
            realm.copyToRealm(r7);
            realm.copyToRealm(r8);

            // Sélection Recette de base
            RealmList<Recette> ma_selection_recette = new RealmList<>();
            ma_selection_recette.add(r1);
            ma_selection_recette.add(r3);
            ma_selection_recette.add(r8);
            realm.copyToRealm(ma_selection_recette);



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





