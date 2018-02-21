package com.example.morga.shoping;

import java.util.ArrayList;

/**
 * Created by etudiant on 21/02/2018.
 */

public class Ma_selection {

    ArrayList<Recette> ma_selection_recette;

    public ArrayList<Recette> getMa_selection_recette() {
        return ma_selection_recette;
    }

    public void setMa_selection_recette(ArrayList<Recette> ma_selection_recette) {
        this.ma_selection_recette = ma_selection_recette;
    }


    public Ma_selection() {
    }

    public Ma_selection(ArrayList<Recette> ma_selection_recette) {
        this.ma_selection_recette = ma_selection_recette;
    }
}
