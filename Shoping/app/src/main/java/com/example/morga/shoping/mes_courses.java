package com.example.morga.shoping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
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
//
//            @Override
//            public CoursesHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//                Log.i("test", "onCreateViewHolder");
//                View vue = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_courses, parent, false);
//                CoursesHolder holder = new CoursesHolder(vue);
//                return holder;
//            }
//
//            @Override
//            public void onBindViewHolder(CoursesHolder holder, int position) {
//                String nomArticle="Ingrédient"+position;
//                int quantity= 2;
//                holder.remplirVue(nomArticle,quantity);
//
//            }
//
//            @Override
//            public int getItemCount() {
//                return 200;
//            }
//
//            class CoursesHolder extends RecyclerView.ViewHolder {
//                private final TextView ui_nomArticleLabel;
//                private final TextView ui_quantityLabel;
//
//                public CoursesHolder(View vue) {
//                    super(vue);
//                    ui_nomArticleLabel = vue.findViewById(R.id.nomArticle);
//                    ui_quantityLabel = vue.findViewById(R.id.quantity);
//
//                }
//
//                public void remplirVue(String nomArticle, int quantite) {
//                    ui_nomArticleLabel.setText(nomArticle);
//                    ui_quantityLabel.setText(quantite);
//
//                }
//            }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}


