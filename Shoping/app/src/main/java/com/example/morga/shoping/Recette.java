package com.example.morga.shoping;

import java.util.ArrayList;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by morga on 21/02/2018.
 */

public class Recette {
    String name;
    String category;
    int nbPeople;
    String preparation;
    ArrayList<IngredientsDeRecette> IngredientsInRecette;

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

    public ArrayList<IngredientsDeRecette> getIngredientsInRecette() {
        return IngredientsInRecette;
    }

    public void setIngredientsInRecette(ArrayList<IngredientsDeRecette> ingredientsInRecette) {
        IngredientsInRecette = ingredientsInRecette;
    }

    public Recette(String name, String category, int nbPeople, String preparation, ArrayList<IngredientsDeRecette> ingredientsInRecette) {
        this.name = name;
        this.category = category;
        this.nbPeople = nbPeople;
        this.preparation = preparation;
        IngredientsInRecette = ingredientsInRecette;
    }
}
