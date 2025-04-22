package com.example.uygulama1;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv_Ulkeler;
    ArrayList<ulke> ulkelerListesi;
    UlkeAdapter adapter;

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
        lv_Ulkeler = findViewById(R.id.listView_Ulkeler);
        ulkelerListesi = new ArrayList<>();
        ulke arjantin = new ulke("Argentina","Bakü",20000000,500000,"İspanyolca",R.drawable.argentina);
        ulke turkiye = new ulke("Türkiye","Ankara",80000000,9000000,"Türkçe",R.drawable.turkey);
        ulke italya = new ulke("İtaly","Roma",580000000,300000,"İtalyanca",R.drawable.italy);
        ulke brezilya = new ulke("Brazil","Brazilya",1300000,600000,"Portekizce",R.drawable.brazil);
        ulke almanya = new ulke("Belgium","Berlin",28500000,20000,"Almanca",R.drawable.belgium);

        ulkelerListesi.add(arjantin);
        ulkelerListesi.add(turkiye);
        ulkelerListesi.add(italya);
        ulkelerListesi.add(brezilya);
        ulkelerListesi.add(almanya);

        adapter = new UlkeAdapter(MainActivity.this,ulkelerListesi);
        lv_Ulkeler.setAdapter(adapter);

    }
}