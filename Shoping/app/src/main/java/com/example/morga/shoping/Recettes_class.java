package com.example.morga.shoping;

import io.realm.RealmObject;

/**
 * Created by valerieoquinot on 26/02/2018.
 */

    public class Recettes_class extends RealmObject {
        String name;
        String ingredients;
        String category;
        int nb_personnes;
        String preparation;


     public Recettes_class() {
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getNb_personnes() {
        return nb_personnes;
    }

    public void setNb_personnes(int nb_personnes) {
        this.nb_personnes = nb_personnes;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public Recettes_class(String name, String ingredients, String category, int nb_personnes, String preparation) {
            this.name = name;
            this.category = category;

    }

}
