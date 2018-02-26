package com.example.morga.shoping;

import java.util.ArrayList;

/**
 * Created by etudiant on 21/02/2018.
 */

public class Ingredients_list_globale {

    ArrayList<Ingredients_class> ingredient_list_globale;

    public Ingredients_list_globale() {
    }

    public Ingredients_list_globale(ArrayList<Ingredients_class> ingredient_list_globale) {
        this.ingredient_list_globale = ingredient_list_globale;
    }

    public ArrayList<Ingredients_class> getIngredient_list_globale() {
        return ingredient_list_globale;
    }

    public void setIngredient_list_globale(ArrayList<Ingredients_class> ingredient_list_globale) {
        this.ingredient_list_globale = ingredient_list_globale;
    }
}
