package com.example.morga.shoping;


import android.content.Context;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by etudiant on 21/02/2018.
 */

public class Ma_selection extends RealmObject {

    RealmList<Recette> ma_selection_recette;

    public RealmList<Recette> getMa_selection_recette() {
        return ma_selection_recette;
    }

    public void setMa_selection_recette(RealmList<Recette> ma_selection_recette) {
        this.ma_selection_recette = ma_selection_recette;
    }


    public Ma_selection() {
    }

    public Ma_selection(RealmList<Recette> ma_selection_recette) {
        this.ma_selection_recette = ma_selection_recette;
    }

    public void add_recette_to_selection(Recette recette) {
        ma_selection_recette.add(recette);
    }
}
