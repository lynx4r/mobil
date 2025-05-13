package com.example.uygulama1;

import java.io.Serializable;

public class Film implements Serializable {
    int film;
    String ad;
    int yil;
    String yonetmen;
    String aciklama;
    float puan;

    public Film(int film, String ad, int yil, String yonetmen, String aciklama, float puan) {
        this.film = film;
        this.ad = ad;
        this.yil = yil;
        this.yonetmen = yonetmen;
        this.aciklama = aciklama;
        this.puan = puan;
    }

    public float getPuan() {
        return puan;
    }

    public void setPuan(float puan) {
        this.puan = puan;
    }

    public int getFilm() {
        return film;
    }

    public void setFilm(int film) {
        this.film = film;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public String getYonetmen() {
        return yonetmen;
    }

    public void setYonetmen(String yonetmen) {
        this.yonetmen = yonetmen;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
