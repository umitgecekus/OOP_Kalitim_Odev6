package com.umit.entity;

public class Hayvan {
    String isim;
    int yas;

    public void sesCikar() {
        System.out.println("Hayvan ses çıkarıyor.");
    }

    public void bilgileriGoster() {
        System.out.println("Hayvan: " + isim + ", Yaş: " + yas);
    }

    public Hayvan(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }
}
