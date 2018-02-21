package com.example.morga.shoping;

import java.util.ArrayList;

/**
 * Created by etudiant on 21/02/2018.
 */

public class Courses {
    ArrayList<Ingredients_class> ingredients_courses;

    public Courses() {
    }


    public Courses(ArrayList<Ingredients_class> ingredients_courses) {
        this.ingredients_courses = ingredients_courses;
    }


    public ArrayList<Ingredients_class> getIngredients_courses() {
        return ingredients_courses;
    }

    public void setIngredients_courses(ArrayList<Ingredients_class> ingredients_courses) {
        this.ingredients_courses = ingredients_courses;
    }
}
