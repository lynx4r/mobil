package com.example.uygulama1;

import java.io.Serializable;

public class ulke implements Serializable {
    String ad;
    String baskent;
    int nufus;
    int yuzOlcumu;
    String dil;
    int resim;

    public ulke() {
    }

    public ulke(String ad, String baskent, int nufus, int yuzOlcumu, String dil, int resim) {
        this.ad = ad;
        this.baskent = baskent;
        this.nufus = nufus;
        this.yuzOlcumu = yuzOlcumu;
        this.dil = dil;
        this.resim = resim;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBaskent() {
        return baskent;
    }

    public void setBaskent(String baskent) {
        this.baskent = baskent;
    }

    public int getNufus() {
        return nufus;
    }

    public void setNufus(int nufus) {
        this.nufus = nufus;
    }

    public int getYuzOlcumu() {
        return yuzOlcumu;
    }

    public void setYuzOlcumu(int yuzOlcumu) {
        this.yuzOlcumu = yuzOlcumu;
    }

    public String getDil() {
        return dil;
    }

    public void setDil(String dil) {
        this.dil = dil;
    }

    public int getResim() {
        return resim;
    }

    public void setResim(int resim) {
        this.resim = resim;
    }
}
