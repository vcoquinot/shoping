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
import android.widget.Toast;

import io.realm.Realm;
import io.realm.RealmResults;

public class liste_ingredients31 extends AbstractActivity {
    private RecyclerView ui_recyclerIngredients;
    private ImageButton ui_picto;
    public String ContentText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_31_liste_ingredients);

        ui_recyclerIngredients = findViewById(R.id.recycler__ingredient);
        ui_recyclerIngredients.setLayoutManager(new LinearLayoutManager(this));
        ui_recyclerIngredients.setAdapter(new AdapterIngredients());

    }

    public void clickCatFruit(View cat_fruit) {
        System.out.println("----------------------------- Cick sur bt catégorie fruit");
//        RealmResults<Ingredients_class> _listIngredient;
//        Realm realm = Realm.getDefaultInstance();
//        _listIngredient = realm.where(Ingredients_class.class).equalTo("category", "fruit").findAll();
        Intent intent = new Intent(liste_ingredients31.this, liste_ingredients31.class);
        intent.putExtra("cat_ingredients", "fruit");
        intent.putExtra(Intent.EXTRA_TEXT, ContentText);
        startActivity(intent);
    }

    public void clickCatLegume(View cat_legume) {
        Intent intent = new Intent(liste_ingredients31.this, liste_ingredients31.class);
        intent.putExtra("cat_ingredients", "légume");
        intent.putExtra(Intent.EXTRA_TEXT, ContentText);
        startActivity(intent);
    }



    class AdapterIngredients extends RecyclerView.Adapter<AdapterIngredients.IngredientsHolder> {
        RealmResults<Ingredients_class> _listIngredient;

        public AdapterIngredients() {

            Realm realm = Realm.getDefaultInstance();

            String laCategorie = getIntent().getStringExtra("cat_ingredients");
            _listIngredient = realm.where(Ingredients_class.class).equalTo("category", laCategorie).findAll();


            if (laCategorie.equals("fruit")) {
                ui_picto = findViewById(R.id.cat_fruit);
//                ui_picto.setImageAlpha(255);
//                ui_picto.setBackgroundColor(#555000);
//                ui_picto.drawableStateChanged ();
            }
            else if (laCategorie.equals("légume")) {
                ui_picto = findViewById(R.id.cat_legume);
                ui_picto.setRotation(-5);
//                ui_picto.setImageAlpha(255);
            }
             else if (laCategorie.equals("boucherie")) {
                ui_picto = findViewById(R.id.cat_boucherie);
                ui_picto.setBackgroundColor(25);
            }
            else if (laCategorie.equals("poissonnerie")) {
                ui_picto = findViewById(R.id.cat_poissonnerie);
                ui_picto.setImageAlpha(255);

            }
            else if (laCategorie.equals("frais")) {
                ui_picto = findViewById(R.id.cat_frais);
                ui_picto.setImageAlpha(255);
            }
            else if (laCategorie.equals("épicerie")) {
                ui_picto = findViewById(R.id.cat_epicerie);
                ui_picto.setImageAlpha(255);
            }
            else if (laCategorie.equals("boissons")) {
                ui_picto = findViewById(R.id.cat_boissons);
                ui_picto.setImageAlpha(255);
            }
//            notifyDataSetChanged();


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

