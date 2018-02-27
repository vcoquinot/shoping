package com.example.morga.shoping;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by morga on 21/02/2018.
 */

public class Recette extends RealmObject {
    String name;
    String category;
    int nbPeople;
    String preparation;
    RealmList<IngredientsDeRecette> listIngredients;

    public Recette() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getNbPeople() {
        return nbPeople;
    }

    public void setNbPeople(int nbPeople) {
        this.nbPeople = nbPeople;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public RealmList<IngredientsDeRecette> getListIngredients() {
        return listIngredients;
    }

    public void setListIngredients(RealmList<IngredientsDeRecette> listIngredients) {
        this.listIngredients = listIngredients;
    }

    public Recette(String name, String category, int nbPeople, String preparation) {
        this.name = name;
        this.category = category;
        this.nbPeople = nbPeople;
        this.preparation = preparation;
        this.listIngredients = new RealmList<>();
    }

    public void addIngredient(IngredientsDeRecette ingredientsDeRecette) {
        listIngredients.add(ingredientsDeRecette);
    }
}
