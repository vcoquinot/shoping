package com.example.morga.shoping;

import io.realm.RealmObject;

/**
 * Created by morga on 21/02/2018.
 */

public class Ingredients_class extends RealmObject {
    String name;
    String category;


    public Ingredients_class() {
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

    public Ingredients_class(String name, String category) {
        this.name = name;
        this.category = category;
    }
}
