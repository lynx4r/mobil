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


    ListView lvUlkeler;
    ArrayList<Ulke> liste;


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


        lvUlkeler = findViewById(R.id.lv_ulkeler);

        liste = new ArrayList<>();
        liste.add(new Ulke(R.drawable.argentina,"Argentina","Buenos Aires",68977648,getString(R.string.aciklama_argentina)));
        liste.add(new Ulke(R.drawable.belgium,"Belgium","Brüksel",86746548,getString(R.string.aciklama_belgium)));
        liste.add(new Ulke(R.drawable.brazil,"Brazil","Brazilya",9641144,getString(R.string.aciklama_brazil)));
        liste.add(new Ulke(R.drawable.canada,"Canada","Ottava",408974531,getString(R.string.aciklama_canada)));
        liste.add(new Ulke(R.drawable.italy,"İtaly","Roma",32135487,getString(R.string.aciklama_italy)));
        liste.add(new Ulke(R.drawable.japan,"Japan","Tokyo",487587,getString(R.string.aciklama_japan)));
        liste.add(new Ulke(R.drawable.spain,"Spain","Madrid",35546815,getString(R.string.aciklama_spain)));
        liste.add(new Ulke(R.drawable.turkey,"Türkiye","Ankara",4879782,getString(R.string.aciklama_turkiye)));

        UlkeAdapter adapter = new UlkeAdapter(this,liste);
        lvUlkeler.setAdapter(adapter);


        lvUlkeler.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Ulke secilenUlke = liste.get(i);
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("secilenUlke",secilenUlke);
                startActivity(intent);
            }
        });
    }
}