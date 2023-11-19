package com.umit.entity;

public class Balik extends Hayvan{
    String cinsi;

    public Balik(String isim, int yas, String cinsi) {
        super(isim, yas);
        this.cinsi = cinsi;
    }
    public void sesCikar() {
        System.out.println("Balik ses çıkarıyor.");
    }

    public void bilgileriGoster() {
        System.out.println("Hayvan: " + isim + ", Yaş: " + yas +", Cinsi: "+cinsi);
    }

}
