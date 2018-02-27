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
    public RealmResults<Recette> _listRecettes;
    private ImageButton ui_picto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_21liste_recettes);

        categorie = getIntent().getStringExtra("cat_recettes");



        ui_listeRecettesRecycler = findViewById(R.id.recycler__recettes);
        ui_listeRecettesRecycler.setLayoutManager(new LinearLayoutManager(this));
        ui_listeRecettesRecycler.setAdapter(new Liste_recettes21.AdapterRecettes());
    }

//    public void clickEntree(View titre_cat_recettes) {
//        cat_recettes = findViewById(R.id.titre_cat_recettes);
//        cat_recettes.setText("ENTRÉE");
//    }

    public void clickOnEntree(View cat_entree) {
        categorie = Category.ENTREE;
        ui_listeRecettesRecycler.setAdapter(new AdapterRecettes());
        //System.out.println("------------------------ Entrée" + categorie);
    }

    public void clickOnPlat(View cat_plat) {
        categorie = Category.PLAT;
        ui_listeRecettesRecycler.setAdapter(new AdapterRecettes());
        //System.out.println("------------------------ Plat" + categorie);
    }

    public void clickOnDessert(View cat_dessert) {
        categorie = Category.DESSERT;
        ui_listeRecettesRecycler.setAdapter(new AdapterRecettes());
        //System.out.println("------------------------ Dessert" + categorie);
    }

    public void clickOnAutre(View cat_autre) {
        categorie = Category.AUTRES;
        ui_listeRecettesRecycler.setAdapter(new AdapterRecettes());
        //System.out.println("------------------------ Autre" + categorie);
    }

    class AdapterRecettes extends RecyclerView.Adapter<Liste_recettes21.AdapterRecettes.MyViewHolder> {

        public AdapterRecettes() {


            Realm realm = Realm.getDefaultInstance();
            _listRecettes = realm.where(Recette.class).equalTo("category", categorie).findAll();

            if (categorie.equals(Category.ENTREE)) {
                ui_picto = findViewById(R.id.cat_entree);
                ui_picto.setBackgroundColor(128);
            }
            else if (categorie.equals(Category.PLAT)) {
                ui_picto = findViewById(R.id.cat_plat);
                ui_picto.setBackgroundColor(128);
            }
            else if (categorie.equals(Category.DESSERT)) {
                ui_picto = findViewById(R.id.cat_dessert);
                ui_picto.setBackgroundColor(128);
            }
            else if (categorie.equals(Category.AUTRES)) {
                ui_picto = findViewById(R.id.cat_autre);
                ui_picto.setImageAlpha(128);
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
            Recette r = _listRecettes.get(position);
            holder.remplirVue(r.getName());
        }

        @Override
        public int getItemCount() {
            return _listRecettes.size();
        }

        class MyViewHolder extends RecyclerView.ViewHolder {
            private final TextView ui_titleLabel;

            public MyViewHolder(View vue) {

                super(vue);
                ui_titleLabel = vue.findViewById(R.id.titre_recette);

            }

            public void remplirVue(String article) {
                ui_titleLabel.setText(article);
            }

        }
    }
}
