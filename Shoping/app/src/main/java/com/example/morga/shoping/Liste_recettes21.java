package com.example.morga.shoping;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import io.realm.Realm;
import io.realm.RealmResults;

public class Liste_recettes21 extends AbstractActivity {
    private RecyclerView ui_listeRecettesRecycler;
    public String categorie;
    public RealmResults<Recettes_class> _listRecettes;
    private ImageButton ui_picto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_21liste_recettes);

        categorie = getIntent().getStringExtra("cat_recettes");

        Realm realm = Realm.getDefaultInstance();

        _listRecettes = realm.where(Recettes_class.class).equalTo("category", categorie).findAll();

        ui_listeRecettesRecycler = findViewById(R.id.recycler__recettes);
        ui_listeRecettesRecycler.setLayoutManager(new LinearLayoutManager(this));
        ui_listeRecettesRecycler.setAdapter(new Liste_recettes21.AdapterRecettes());
    }

//    public void clickEntree(View titre_cat_recettes) {
//        cat_recettes = findViewById(R.id.titre_cat_recettes);
//        cat_recettes.setText("ENTRÉE");
//    }

    public void clickOnEntree(View cat_entree) {
        categorie = "entrée";
        ui_listeRecettesRecycler.setAdapter(new AdapterRecettes());
        System.out.println("------------------------ Entrée" + categorie);
    }

    public void clickOnPlat(View cat_plat) {
        categorie = "plat";
        ui_listeRecettesRecycler.setAdapter(new AdapterRecettes());
        System.out.println("------------------------ Plat" + categorie);
    }

    public void clickOnDessert(View cat_dessert) {
        categorie = "dessert";
        ui_listeRecettesRecycler.setAdapter(new AdapterRecettes());
        System.out.println("------------------------ Dessert" + categorie);
    }

    public void clickOnAutre(View cat_autre) {
        categorie = "autre";
        ui_listeRecettesRecycler.setAdapter(new AdapterRecettes());
        System.out.println("------------------------ Autre" + categorie);
    }

    class AdapterRecettes extends RecyclerView.Adapter<Liste_recettes21.AdapterRecettes.MyViewHolder> {

        public AdapterRecettes() {

            Realm realm = Realm.getDefaultInstance();
            _listRecettes = realm.where(Recettes_class.class).equalTo("category", categorie).findAll();

            if (categorie.equals("entree")) {
                ui_picto = findViewById(R.id.cat_entree);
                ui_picto.setBackgroundColor(128);
            }
            else if (categorie.equals("plat")) {
                ui_picto = findViewById(R.id.cat_plat);
                ui_picto.setBackgroundColor(128);
            }
            else if (categorie.equals("dessert")) {
                ui_picto = findViewById(R.id.cat_dessert);
                ui_picto.setBackgroundColor(25);
            }
            else if (categorie.equals("autre")) {
                ui_picto = findViewById(R.id.cat_autre);
                ui_picto.setImageAlpha(255);
            }
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View vue = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_recettes, parent, false);
            MyViewHolder holder = new MyViewHolder(vue);
            return holder;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
        }

        @Override
        public int getItemCount() {
            return 200;
        }

        class MyViewHolder extends RecyclerView.ViewHolder {
            private final TextView ui_titleLabel;

            public MyViewHolder(View vue) {

                super(vue);
                ui_titleLabel = vue.findViewById(R.id.titre_cat_recettes);

            }

            public void remplirVue(String article) {
                ui_titleLabel.setText(article);
            }

        }
    }
}
