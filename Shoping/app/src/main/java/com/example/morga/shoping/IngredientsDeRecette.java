package com.example.morga.shoping;

import io.realm.RealmObject;

/**
 * Created by morga on 21/02/2018.
 */

public class IngredientsDeRecette extends RealmObject {
    int quantity;
    Ingredients_class ingredient;

    public IngredientsDeRecette() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Ingredients_class getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredients_class ingredient) {
        this.ingredient = ingredient;
    }

    public IngredientsDeRecette(int quantity, Ingredients_class ingredient) {
        this.quantity = quantity;
        this.ingredient = ingredient;
    }
}
