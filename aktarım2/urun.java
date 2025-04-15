package com.example.uygulama1;

import java.io.Serializable;

public class urun  implements Serializable {
    int id;
    String ad;
    double fiyat;
    int stokMiktari;
    boolean stokDurum;

    public urun(int id, String ad, double fiyat, int stokMiktari, boolean stokDurum){
        this.id = id;
        this.ad = ad;
        this.fiyat = fiyat;
        this.stokMiktari = stokMiktari;
        this.stokDurum = stokDurum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public int getStokMiktari() {
        return stokMiktari;
    }

    public void setStokMiktari(int stokMiktari) {
        this.stokMiktari = stokMiktari;
    }

    public boolean isStokDurum() {
        return stokDurum;
    }

    public void setStokDurum(boolean stokDurum) {
        this.stokDurum = stokDurum;
    }
}
