package com.example.uygulama1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvFilmler;
    ArrayList<Film> liste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        lvFilmler = findViewById(R.id.lv_filmler);

        liste = new ArrayList<>();
        liste.add(new Film(R.drawable.i_robot,"I robot",2004,"Alex Proyas",getString(R.string.aciklama_irobot),2));
        liste.add(new Film(R.drawable.ice_age,"İce Age",2002,"Steve Martino",getString(R.string.aciklama_iceage),3));
        liste.add(new Film(R.drawable.ip_man,"İp Man",1972,"Wilson Yip",getString(R.string.aciklama_ipman),5));
        liste.add(new Film(R.drawable.iron_man,"Iron Man",2008,"Shane Black",getString(R.string.aciklama_ironman),4));
        liste.add(new Film(R.drawable.jumanji,"Jumanji",1995,"Jake Kasdan",getString(R.string.aciklama_jumanji),5));
        liste.add(new Film(R.drawable.king_arthur,"King Arthur",2004,"Antoine Fuqua",getString(R.string.aciklama_kingarthur),1));
        liste.add(new Film(R.drawable.kungfu_panda,"Kungfu Panda",2008,"Mark Osborne",getString(R.string.aciklama_kungfupanda),5));
        liste.add(new Film(R.drawable.inception,"İnception",2010,"Christopher Nolan",getString(R.string.aciklama_inception),3));



        FilmAdapter adapter = new FilmAdapter(this,liste);
        lvFilmler.setAdapter(adapter);

        lvFilmler.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Film secilenFilm = liste.get(i);
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("secilenFilm",secilenFilm);
                startActivity(intent);

            }
        });
    }
}