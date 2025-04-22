package com.example.uygulama1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class UlkeAdapter extends BaseAdapter {
    Context context;
    ArrayList<ulke> liste;

    public UlkeAdapter(Context context, ArrayList<ulke> liste) {
        this.context = context;
        this.liste = liste;
    }

    @Override
    public int getCount() {
        return liste.size();
    }

    @Override
    public Object getItem(int i) {
        return liste.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView ivResim;
        TextView tv_ad,tvBaskent;
        ulke ulke = liste.get(i);
        if (view==null)

            view = LayoutInflater.from(context).inflate(R.layout.ulke_satir,viewGroup,false);

        ivResim = view.findViewById(R.id.imageView_satir_resim);
        tv_ad = view.findViewById(R.id.textView_satir_ad);
        tvBaskent = view.findViewById(R.id.textView_satir_baskent);

        tv_ad.setText(ulke.ad);
        tvBaskent.setText(ulke.baskent);
        ivResim.setImageResource(ulke.resim);

        return view;
    }
}
