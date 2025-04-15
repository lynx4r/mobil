package com.example.uygulama1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class urunDetay extends AppCompatActivity {
    TextView tvId,tvAd,tvFiyat,tvStok;
    Switch swStok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_urundetay);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent intent = getIntent();
        urun gelenUrun = (urun)intent.getSerializableExtra("gidecekUrun");
        tvId = findViewById(R.id.textView_id);
        tvAd = findViewById(R.id.textView_ad);
        tvStok = findViewById(R.id.textView_stokMiktari);
        tvFiyat = findViewById(R.id.textView_fiyat);
        swStok = findViewById(R.id.switch_stokDurum);

        tvId.setText("UrunID:"+gelenUrun.getId());
        tvAd.setText("UrunAdi:"+gelenUrun.getId());
    }

}