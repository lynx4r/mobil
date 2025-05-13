package com.example.uygulama1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FilmAdapter extends BaseAdapter {

    Context context;
    ArrayList<Film>filmler;

    public FilmAdapter(Context context, ArrayList<Film>filmler){
        this.context = context;
        this.filmler = filmler;
    }

    @Override
    public int getCount() {
        return filmler.size();
    }

    @Override
    public Object getItem(int i) {
        return filmler.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView ivSatirFilm;
        TextView tvSatirad,tvSatiryil,tvSatiryonetmen;

        Film film = filmler.get(i);  // Sıradakı film nesnesi elde edilir

        if (view == null){
            view = View.inflate(context, R.layout.satir, null);
        }

        ivSatirFilm = view.findViewById(R.id.iv_satir_film);
        tvSatirad = view.findViewById(R.id.tv_satir_ad);
        tvSatiryil = view.findViewById(R.id.tv_satir_yil);
        tvSatiryonetmen = view.findViewById(R.id.tv_satir_yonetmen);

        ivSatirFilm.setImageResource(film.getFilm());
        tvSatirad.setText(film.getAd());
        tvSatiryil.setText(film.getFilm());
        tvSatiryonetmen.setText("Yönetmen: "+film.getYonetmen());

        return view;
    }
}
