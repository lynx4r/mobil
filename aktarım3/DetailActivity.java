package com.example.uygulama1;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailActivity extends AppCompatActivity {

    ImageView ivBayrak;
    TextView tvAd,tvAciklama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ivBayrak = findViewById(R.id.iv_bayrak);
        tvAd = findViewById(R.id.tv_ad);
        tvAciklama = findViewById(R.id.tv_aciklama);

        Ulke ulke =(Ulke) getIntent().getSerializableExtra("secilenUlke");

        if (ulke!=null){
            ivBayrak.setImageResource(ulke.getBayrak());
            tvAd.setText(ulke.getAd());
            tvAciklama.setText(ulke.getAciklama());
        }
    }
}