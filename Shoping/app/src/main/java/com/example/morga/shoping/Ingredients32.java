package com.example.morga.shoping;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Ingredients32 extends AbstractActivity {
public String categoryIngredient;
public Button ui_valider;
public Button ui_annuler;
public boolean VerifCategorie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_32ingredients);
    }
    public void Clickfruits (View categorieFruitButton){
        categoryIngredient=Category.FRUITS;

    }
    public void ClickLegumes(View categorieLegumesButton){
        categoryIngredient=Category.LEGUMES;
    }
    public void ClickEpicerie(View categorieEpicerieButton){
        categoryIngredient=Category.EPICERIE;
    }
    public void ClickBoucherie(View categorieBoucherieButton){
        categoryIngredient=Category.BOUCHERIE;
    }
    public void ClickPoissons(View categoriePoissonsButton){
        categoryIngredient=Category.POISSONNERIE;
    }
    public void ClickFrais(View categorieFraisButton){
        categoryIngredient=Category.FRAIS;
    }
    public void ClickAutres(View categorieAutresButton){
        categoryIngredient=Category.AUTRES;
    }
    public void ClickBoissons(View categorieBoissonsButton){
        categoryIngredient=Category.BOISSONS;
    }
    public void Verif(){
        if (categoryIngredient==""){
            ui_valider=findViewById(R.id.valider_button);
            ui_valider.setVisibility(View.INVISIBLE);
            ui_annuler=findViewById(R.id.annuler_button);
            ui_annuler.setVisibility(View.INVISIBLE);
        }
    }





}
