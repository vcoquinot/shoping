package com.example.morga.shoping;

/**
 * Created by morga on 21/02/2018.
 */

public class IngredientsDeRecette {
    int quantity;
    Ingredients ingredient;

    public IngredientsDeRecette() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Ingredients getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredients ingredient) {
        this.ingredient = ingredient;
    }

    public IngredientsDeRecette(int quantity, Ingredients ingredient) {
        this.quantity = quantity;
        this.ingredient = ingredient;
    }
}
