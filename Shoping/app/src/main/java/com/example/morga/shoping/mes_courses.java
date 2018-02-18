package com.example.morga.shoping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class mes_courses extends AppCompatActivity {

    private RecyclerView ui_listecourseRecycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_40mes_courses);

        ui_listecourseRecycler = findViewById(R.id.recycler_courses);
//
//
        ui_listecourseRecycler.setLayoutManager(new LinearLayoutManager(this));
//
        ui_listecourseRecycler.setAdapter(new AdapterCourses());
    }

    //
//
    class AdapterCourses extends RecyclerView.Adapter<AdapterCourses.MyViewHolder> {

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View vue = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_courses, parent, false);
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
            private final TextView ui_quantityLabel;

            public MyViewHolder(View vue) {

                super(vue);
                ui_titleLabel = vue.findViewById(R.id.nomArticle);
                ui_quantityLabel = vue.findViewById(R.id.quantity);
            }

            public void remplirVue(String article, int quantity) {
                ui_titleLabel.setText(article);
                ui_quantityLabel.setText(quantity);
            }

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()== R.id.ma_selection_menu){
            Intent selection=new Intent(this,selection_recette.class);
            startActivity(selection);

        }
        else if (item.getItemId()==R.id.courses_menu){
            Intent courses=new Intent(this,mes_courses.class);
            startActivity(courses);
        }
        else if (item.getItemId()==R.id.newIngredient_menu){
            Intent nvingredient=new Intent(this,liste_ingredients.class);
            startActivity(nvingredient);
        }
        else if (item.getItemId()==R.id.aide_menu){
            Intent aide=new Intent(this,Aide_mentions.class);
            startActivity(aide);
        }
        else if (item.getItemId()==R.id.recettes_menu){
            Intent recettes=new Intent(this,categorie_recette.class);
            startActivity(recettes);
        }
        return super.onOptionsItemSelected(item);
    }


}


