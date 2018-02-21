package com.example.morga.shoping;

/**
 * Created by morga on 21/02/2018.
 */

public class IngredientsDeRecette {
    int quantity;
    Ingredients32 ingredient;

    public IngredientsDeRecette() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Ingredients32 getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredients32 ingredient) {
        this.ingredient = ingredient;
    }

    public IngredientsDeRecette(int quantity, Ingredients32 ingredient) {
        this.quantity = quantity;
        this.ingredient = ingredient;
    }
}
