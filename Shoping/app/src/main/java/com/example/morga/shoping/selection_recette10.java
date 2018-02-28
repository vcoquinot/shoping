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

import io.realm.RealmResults;

public class selection_recette10 extends AbstractActivity {

    private RecyclerView ui_liste_recettes_selectionRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10selection_recette);

        ui_liste_recettes_selectionRecycler = findViewById(R.id.recycler_selection_recettes);
        ui_liste_recettes_selectionRecycler.setLayoutManager(new LinearLayoutManager(this));
        ui_liste_recettes_selectionRecycler.setAdapter(new selection_recette10.AdapterListeRecetteSelection());


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }
    class AdapterListeRecetteSelection extends RecyclerView.Adapter<AdapterListeRecetteSelection.MyViewHolder> {
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
            return 100;
        }

        class MyViewHolder extends RecyclerView.ViewHolder {
            private final TextView ma_recette;

            public MyViewHolder(View vue) {

                super(vue);
                ma_recette = vue.findViewById(R.id.titre_recette);
            }

            public void remplirVue(String recette) {
                ma_recette.setText(recette);
            }
        }
    }



}
