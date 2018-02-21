package com.example.morga.shoping;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import io.realm.Realm;
import io.realm.RealmResults;

public class liste_ingredients extends AbstractActivity {
    private RecyclerView ui_recyclerIngredients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_31_liste_ingredients);

        ui_recyclerIngredients = findViewById(R.id.recycler__ingredient);
        ui_recyclerIngredients.setLayoutManager(new LinearLayoutManager(this));
        ui_recyclerIngredients.setAdapter(new AdapterIngredients());

    }

    class AdapterIngredients extends RecyclerView.Adapter<AdapterIngredients.IngredientsHolder> {
        RealmResults<Ingredients_class> _listIngredient;

        public AdapterIngredients() {

            Realm realm = Realm.getDefaultInstance();
            _listIngredient = realm.where(Ingredients_class.class).findAll();

        }
        void supprimerIngredient(Ingredients_class ingredientASupprimer, int position){
            Realm realm=Realm.getDefaultInstance();
            realm.beginTransaction();
            ingredientASupprimer.deleteFromRealm();
            realm.commitTransaction();
            notifyItemRemoved(position);

        }
            @Override
            public IngredientsHolder onCreateViewHolder (ViewGroup parent,int viewType){
                View vue = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_ingredients, parent, false);
                IngredientsHolder holder = new IngredientsHolder(vue);
                return holder;
            }

            @Override
            public void onBindViewHolder (IngredientsHolder holder,int position){
                Ingredients_class ingredient = _listIngredient.get(position);
                holder.remplirVue(ingredient.getName());

            }

            @Override
            public int getItemCount () {
                return _listIngredient.size();
            }
            class IngredientsHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
                private final TextView ui_nameLabel;


                public IngredientsHolder(View vue) {
                    super(vue);
                    ui_nameLabel = vue.findViewById(R.id.name);
                    vue.setOnClickListener(this);


                }

                public void remplirVue(String name) {
                    ui_nameLabel.setText(name);


                }

                @Override
                public void onClick(View view) {
                    view=findViewById(R.id.del_button);
                    int numIngredient=getAdapterPosition();
                    Ingredients_class ingr=_listIngredient.get(numIngredient);
                    Toast.makeText(view.getContext(),"Ingrédient supprimé",Toast.LENGTH_LONG).show();
                    supprimerIngredient(ingr,numIngredient);
                }
            }

        }

    }

