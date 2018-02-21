package com.example.morga.shoping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

public class categorie_recette extends AbstractActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_20categorie_recette);
    }

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
        else if (item.getItemId()==R.id.recettes_menu){
            Intent recettes=new Intent(this,categorie_recette.class);
            startActivity(recettes);
        }
        return super.onOptionsItemSelected(item);
    }

    public void clickEntree(View entreeImageButton) {
        Intent intent = new Intent(categorie_recette.this, Liste_recettes.class);
        startActivity(intent);
    }

    public void clickPlat(View platImageButton) {
        Intent intent = new Intent(categorie_recette.this, Liste_recettes.class);
        startActivity(intent);
    }

    public void clickDessert(View dessertImageButton) {
        Intent intent = new Intent(categorie_recette.this, Liste_recettes.class);
        startActivity(intent);
    }

    public void clickAutre(View autreImageButton) {
        Intent intent = new Intent(categorie_recette.this, Liste_recettes.class);
        startActivity(intent);
    }
}
