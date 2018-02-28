package com.example.morga.shoping;

import android.content.Intent;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import io.realm.Realm;
import io.realm.RealmResults;

public class Ingredients32 extends AbstractActivity {
    private EditText ui_inputField;
    public String categoryIngredient;
    public Button ui_valider;
    public Button ui_annuler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_32ingredients);
        ui_valider = findViewById(R.id.valider_button);
        ui_annuler = findViewById(R.id.annuler_button);
        ui_inputField=findViewById(R.id.nom_nl_ingredient);

    }

    public void Clickfruits(View categorieFruitButton) {
        categoryIngredient = Category.FRUITS;
        checkIfSelected();

    }

    public void ClickLegumes(View categorieLegumesButton) {
        categoryIngredient = Category.LEGUMES;
        checkIfSelected();
    }

    public void ClickEpicerie(View categorieEpicerieButton) {
        categoryIngredient = Category.EPICERIE;
        checkIfSelected();
    }

    public void ClickBoucherie(View categorieBoucherieButton) {
        categoryIngredient = Category.BOUCHERIE;
        checkIfSelected();
    }

    public void ClickPoissons(View categoriePoissonsButton) {
        categoryIngredient = Category.POISSONNERIE;
        checkIfSelected();
    }

    public void ClickFrais(View categorieFraisButton) {
        categoryIngredient = Category.FRAIS;
        checkIfSelected();
    }

    public void ClickBoissons(View categorieBoissonsButton) {
        categoryIngredient = Category.BOISSONS;
        checkIfSelected();
    }

    public void checkIfSelected() {
        if (categoryIngredient != null) {
            ui_valider.setVisibility(View.VISIBLE);
            ui_annuler.setVisibility(View.VISIBLE);
        }
    }
    public void ClickAnnuler(View bouttonAnnuler){

        Intent intent=new Intent(Ingredients32.this, categorie_ingredient30.class);
        startActivity(intent);
    }
    public void ClickValider(View bouttonValider){

        Realm realm=Realm.getDefaultInstance();
        realm.beginTransaction();
        String val = ui_inputField.getText().toString();
        realm.copyToRealm(new Ingredients_class(val,categoryIngredient));
        Intent intent=new Intent(Ingredients32.this, categorie_ingredient30.class);
        realm.commitTransaction();
        startActivity(intent);
    }
}
//public void Onclick(final View view){
//       while (categoryIngredient==null){
//            ui_valider=findViewById(R.id.valider_button);
//            ui_valider.setVisibility(View.INVISIBLE);
//            ui_annuler=findViewById(R.id.annuler_button);
//            ui_annuler.setVisibility(View.INVISIBLE);
//        }
//    ui_valider.setOnClickListener(new View.OnClickListener() {
//public void addListener
//        @Override
//        public void onClick(View v) {
//
//            Toast.makeText(view.getContext(),
//                    categoryIngredient,
//                    Toast.LENGTH_SHORT).show();
//    }








