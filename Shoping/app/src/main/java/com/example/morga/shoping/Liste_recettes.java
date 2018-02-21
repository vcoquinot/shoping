package com.example.morga.shoping;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Liste_recettes extends AbstractActivity {
    private RecyclerView ui_listeRecettesRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_21liste_recettes);

        ui_listeRecettesRecycler = findViewById(R.id.recycler_courses);
//
//
        ui_listeRecettesRecycler.setLayoutManager(new LinearLayoutManager(this));
//
        ui_listeRecettesRecycler.setAdapter(new Liste_recettes.AdapterRecettes());
    }

    class AdapterRecettes extends RecyclerView.Adapter<Liste_recettes.AdapterRecettes.MyViewHolder> {

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
                ui_titleLabel = vue.findViewById(R.id.nom_recette);

            }

            public void remplirVue(String article, int quantity) {
                ui_titleLabel.setText(article);
            }

        }

    }




}
