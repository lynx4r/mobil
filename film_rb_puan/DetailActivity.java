package com.example.uygulama1;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailActivity extends AppCompatActivity {

    ImageView ivFilm;
    TextView tvAd,tvAciklama;
    RatingBar rbPuan;

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

        ivFilm = findViewById(R.id.iv_film);
        tvAd = findViewById(R.id.tv_ad);
        tvAciklama = findViewById(R.id.tv_aciklama);
        rbPuan = findViewById(R.id.rb_imdb);


        Film film = (Film) getIntent().getSerializableExtra("secilenFilm");


        if (film!=null){
            ivFilm.setImageResource(film.getFilm());
            tvAd.setText(film.getAd());
            tvAciklama.setText(film.getAciklama());
            rbPuan.setRating(film.puan);

        }


    }
}