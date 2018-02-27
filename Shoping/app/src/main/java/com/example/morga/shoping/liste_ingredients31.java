package com.example.morga.shoping;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import io.realm.Realm;
import io.realm.RealmResults;


public class liste_ingredients31 extends AbstractActivity {
    private RecyclerView ui_recyclerIngredients;
    private ImageButton ui_picto;
    public String ContentText;
    public String laCategorie;
    public RealmResults<Ingredients_class> _listIngredient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_31_liste_ingredients);


        laCategorie = getIntent().getStringExtra("cat_ingredients");

        if (laCategorie == null) {laCategorie = Category.ENTREE;}


        Realm realm = Realm.getDefaultInstance();

        _listIngredient = realm.where(Ingredients_class.class).equalTo("category", laCategorie).findAll();

        ui_recyclerIngredients = findViewById(R.id.recycler__ingredient);
        ui_recyclerIngredients.setLayoutManager(new LinearLayoutManager(this));
        ui_recyclerIngredients.setAdapter(new AdapterIngredients());
    }

    public void clickCatFruit(View cat_fruit) {
        laCategorie = Category.FRUITS;
        ui_recyclerIngredients.setAdapter(new AdapterIngredients());
    }

    public void clickCatLegume(View cat_legume) {
        laCategorie = Category.LEGUMES;
        ui_recyclerIngredients.setAdapter(new AdapterIngredients());
    }

    public void clickCatBoucherie(View cat_boucherie) {
        laCategorie = Category.BOUCHERIE;
        ui_recyclerIngredients.setAdapter(new AdapterIngredients());
    }

    public void clickCatPoissonnerie(View cat_poissonnerie) {
        laCategorie = Category.POISSONNERIE;
        ui_recyclerIngredients.setAdapter(new AdapterIngredients());
    }

    public void clickCatFrais(View cat_frais) {
        laCategorie = Category.FRAIS;
        ui_recyclerIngredients.setAdapter(new AdapterIngredients());
    }

    public void clickCatEpicerie(View cat_epicerie) {
        laCategorie = Category.EPICERIE;
        ui_recyclerIngredients.setAdapter(new AdapterIngredients());
    }

    public void clickCatBoissons(View cat_boissons) {
        laCategorie = Category.BOISSONS;
        ui_recyclerIngredients.setAdapter(new AdapterIngredients());
    }

    class AdapterIngredients extends RecyclerView.Adapter<AdapterIngredients.IngredientsHolder> {


        public AdapterIngredients() {

            Realm realm = Realm.getDefaultInstance();


            _listIngredient = realm.where(Ingredients_class.class).equalTo("category", laCategorie).findAll();


            if (laCategorie.equals(Category.FRUITS)) {
                ui_picto = findViewById(R.id.cat_fruit);
                razPictos();
                ui_picto.setAlpha(1.0f);

            }
            else if (laCategorie.equals(Category.LEGUMES)) {
                razPictos();
                ui_picto = findViewById(R.id.cat_legume);
                ui_picto.setAlpha(1.0f);

            }
             else if (laCategorie.equals(Category.BOUCHERIE)) {
                razPictos();
                ui_picto = findViewById(R.id.cat_boucherie);
                ui_picto.setAlpha(1.0f);
            }
            else if (laCategorie.equals(Category.POISSONNERIE)) {
                razPictos();
                ui_picto = findViewById(R.id.cat_poissonnerie);
                ui_picto.setAlpha(1.0f);
            }
            else if (laCategorie.equals(Category.FRAIS)) {
                razPictos();
                ui_picto = findViewById(R.id.cat_frais);
                ui_picto.setAlpha(1.0f);
            }
            else if (laCategorie.equals(Category.EPICERIE)) {
                razPictos();
                ui_picto = findViewById(R.id.cat_epicerie);

                ui_picto.setAlpha(1.0f);
            }
            else if (laCategorie.equals(Category.BOISSONS)) {
                razPictos();
                ui_picto = findViewById(R.id.cat_boissons);
                ui_picto.setAlpha(1.0f);
            }


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
                private final ImageView ui_delButton;


                public IngredientsHolder(View vue) {
                    super(vue);
                    ui_nameLabel = vue.findViewById(R.id.titre_recette);
                    ui_delButton = vue.findViewById(R.id.del_button);
                    ui_delButton.setOnClickListener(this);
                }

                public void remplirVue(String name) {
                    ui_nameLabel.setText(name);
                }

                @Override
                public void onClick(View view) {
                    int numIngredient=getAdapterPosition();
                    Ingredients_class ingr=_listIngredient.get(numIngredient);
                    Toast.makeText(view.getContext(),"Ingrédient supprimé",Toast.LENGTH_LONG).show();
                    supprimerIngredient(ingr,numIngredient);
                }

            }
        }
    private void razPictos() {
        ui_picto = findViewById(R.id.cat_fruit);
        ui_picto.setAlpha(0.6f);


        ui_picto = findViewById(R.id.cat_legume);
        ui_picto.setAlpha(0.6f);


        ui_picto = findViewById(R.id.cat_boucherie);
        ui_picto.setAlpha(0.6f);

        ui_picto = findViewById(R.id.cat_poissonnerie);
        ui_picto.setAlpha(0.6f);

        ui_picto = findViewById(R.id.cat_frais);
        ui_picto.setAlpha(0.6f);

        ui_picto = findViewById(R.id.cat_epicerie);
        ui_picto.setAlpha(0.6f);

        ui_picto = findViewById(R.id.cat_boissons);
        ui_picto.setAlpha(0.6f);
    }
    }

