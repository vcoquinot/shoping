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

public class Ma_recette extends AbstractActivity {
    private RecyclerView ui_listeIngredientsRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_22ma_recette);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        ui_listeIngredientsRecycler = findViewById(R.id.recycler_ingredients);
//
//
        ui_listeIngredientsRecycler.setLayoutManager(new LinearLayoutManager(this));
//
        ui_listeIngredientsRecycler.setAdapter(new AdapterIngredients());
    }


    class AdapterIngredients extends RecyclerView.Adapter<AdapterIngredients.MyViewHolder>{

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View vue = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_ingredients, parent, false);
            MyViewHolder holder = new MyViewHolder(vue);
            return holder;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 10;
        }

        class MyViewHolder extends RecyclerView.ViewHolder {
            private final TextView ui_titleLabel;
            private final TextView ui_quantityLabel;

            public MyViewHolder(View vue) {

                super(vue);
                ui_titleLabel = vue.findViewById(R.id.nomArticle);
                ui_quantityLabel = vue.findViewById(R.id.quantity);
            }

            public void remplirVue(String ingredient, int quantite) {
                ui_titleLabel.setText(ingredient);
                ui_quantityLabel.setText(quantite);
            }

        }

    }






}
