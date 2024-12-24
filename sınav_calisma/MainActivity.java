package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox_corba,checkBox_kofte,checkBox_lahmacun,checkbox_pilav,checkBox_magnolia;
    Button button_siparisver;
    TextView textView_siparisozet;
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
        checkBox_corba=findViewById(R.id.checkBox_Corba);
        checkBox_kofte=findViewById(R.id.checkBox_Kofte);
        checkBox_lahmacun=findViewById(R.id.checkBox_Lahmacun);
        checkbox_pilav=findViewById(R.id.checkBox_Pilav);
        checkBox_magnolia=findViewById(R.id.checkBox_Magnolia);
        button_siparisver=findViewById(R.id.button_Siparis);
        textView_siparisozet=findViewById(R.id.textView_Ozet);

        button_siparisver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float corbafiyat = 60, koftefiyat = 190, lahmacunfiyat = 90, pilavfiyat = 110, magnoliafiyat = 50;
                float toplamtutar = 0;
                String s = "Sipariş Özeti:\n-----------------\n";


                if (checkBox_corba.isChecked()) {
                    toplamtutar += corbafiyat;
                    s += "Çorba\n";
                }
                if (checkBox_kofte.isChecked()) {
                    toplamtutar += koftefiyat;
                    s += "Köfte\n";
                }
                if (checkBox_lahmacun.isChecked()) {
                    toplamtutar += lahmacunfiyat;
                    s += "Lahmacun\n";
                }
                if (checkbox_pilav.isChecked()) {
                    toplamtutar += pilavfiyat;
                    s += "Pilav\n";
                }
                if (checkBox_magnolia.isChecked()) {
                    toplamtutar += magnoliafiyat;
                    s += "Sütlaç\n";
                }

                textView_siparisozet.setText(s + "-------\nToplam Tutar: " + toplamtutar);
            }
        });
    }
}