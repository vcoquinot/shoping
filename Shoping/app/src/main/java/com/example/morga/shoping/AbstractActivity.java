package com.example.morga.shoping;

import android.app.ActionBar;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/**
 * Created by morga on 20/02/2018.
 */

public class AbstractActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()== R.id.ma_selection_menu){
            Intent selection=new Intent(this,selection_recette.class);
            startActivity(selection);

        }
        else if (item.getItemId()==R.id.courses_menu){
            Intent courses=new Intent(this,mes_courses.class);
            startActivity(courses);
        }
        else if (item.getItemId()==R.id.newIngredient_menu){
            Intent nvingredient=new Intent(this,Ingredients.class);
            startActivity(nvingredient);
        }
        else if (item.getItemId()==R.id.aide_menu){
            Intent aide=new Intent(this,Aide_mentions.class);
            startActivity(aide);
        }
        else if (item.getItemId()==R.id.newRecette_menu){
            Intent nvrecette=new Intent(this,Ma_recette_creation.class);
            startActivity(nvrecette);
        }
        else if (item.getItemId()==R.id.listIngr){
            Intent liste_ingredients=new Intent(this,liste_ingredients.class);
            startActivity(liste_ingredients);
        }
        else if (item.getItemId()==R.id.catIngr){
            Intent categorie_ingr=new Intent(this,categorie_ingredient.class);
            startActivity(categorie_ingr);
        }
        else if (item.getItemId()==R.id.recettes_menu){
            Intent categorie_recette=new Intent(this,categorie_recette.class);
            startActivity(categorie_recette);
        }
        else if (item.getItemId()==R.id.accueil){
            Intent accueil=new Intent(this,Accueil.class);
            startActivity(accueil);
        }
        else if (item.getItemId()==R.id.ma_recette_menu){
            Intent maRecette=new Intent(this,Ma_recette.class);
            startActivity(maRecette);
        }

        return super.onOptionsItemSelected(item);
    }
}
